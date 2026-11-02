.class public final Lsp;
.super Lv3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic c:B

.field public final synthetic d:Lwp;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwp;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lsp;->c:B

    .line 3
    .line 4
    iput-object p1, p0, Lsp;->d:Lwp;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lv3;-><init>(Lwp;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "power"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/os/PowerManager;

    .line 20
    .line 21
    iput-object p1, p0, Lsp;->e:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lwp;Lzv7;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lsp;->c:B

    .line 24
    iput-object p1, p0, Lsp;->d:Lwp;

    invoke-direct {p0, p1}, Lv3;-><init>(Lwp;)V

    .line 25
    iput-object p2, p0, Lsp;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final g()Landroid/content/IntentFilter;
    .locals 1

    .line 1
    iget-byte p0, p0, Lsp;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Landroid/content/IntentFilter;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/content/IntentFilter;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v0, "android.intent.action.TIME_SET"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "android.intent.action.TIME_TICK"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    new-instance p0, Landroid/content/IntentFilter;

    .line 28
    .line 29
    invoke-direct {p0}, Landroid/content/IntentFilter;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v0, "android.os.action.POWER_SAVE_MODE_CHANGED"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lsp;->c:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, Lsp;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Lzv7;

    .line 13
    .line 14
    iget-object v1, v0, Lzv7;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/location/LocationManager;

    .line 17
    .line 18
    iget-object v4, v0, Lzv7;->Z:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ldg;

    .line 21
    .line 22
    iget-wide v5, v4, Ldg;->b:J

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    cmp-long v5, v5, v7

    .line 29
    .line 30
    if-lez v5, :cond_0

    .line 31
    .line 32
    iget-boolean v0, v4, Ldg;->a:Z

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_0
    iget-object v0, v0, Lzv7;->X:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Landroid/content/Context;

    .line 39
    .line 40
    const-string v5, "android.permission.ACCESS_COARSE_LOCATION"

    .line 41
    .line 42
    invoke-static {v0, v5}, Lw51;->p(Landroid/content/Context;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/4 v6, 0x0

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    const-string v5, "network"

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v1, v5}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    invoke-virtual {v1, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 58
    .line 59
    .line 60
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 62
    :catch_0
    :cond_1
    move-object v5, v6

    .line 63
    :goto_0
    const-string v7, "android.permission.ACCESS_FINE_LOCATION"

    .line 64
    .line 65
    invoke-static {v0, v7}, Lw51;->p(Landroid/content/Context;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    const-string v0, "gps"

    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 80
    .line 81
    .line 82
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 83
    :catch_1
    :cond_2
    if-eqz v6, :cond_3

    .line 84
    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {v6}, Landroid/location/Location;->getTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    invoke-virtual {v5}, Landroid/location/Location;->getTime()J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    cmp-long v0, v0, v7

    .line 96
    .line 97
    if-lez v0, :cond_4

    .line 98
    .line 99
    :goto_1
    move-object v5, v6

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    if-eqz v6, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    :goto_2
    const/4 v0, 0x0

    .line 105
    if-eqz v5, :cond_b

    .line 106
    .line 107
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    sget-object v1, Ltg8;->d:Ltg8;

    .line 112
    .line 113
    if-nez v1, :cond_5

    .line 114
    .line 115
    new-instance v1, Ltg8;

    .line 116
    .line 117
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    sput-object v1, Ltg8;->d:Ltg8;

    .line 121
    .line 122
    :cond_5
    move-object v13, v1

    .line 123
    const-wide/32 v20, 0x5265c00

    .line 124
    .line 125
    .line 126
    sub-long v18, v11, v20

    .line 127
    .line 128
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 129
    .line 130
    .line 131
    move-result-wide v14

    .line 132
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 133
    .line 134
    .line 135
    move-result-wide v16

    .line 136
    invoke-virtual/range {v13 .. v19}, Ltg8;->a(DDJ)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 144
    .line 145
    .line 146
    move-result-wide v9

    .line 147
    move-object v6, v13

    .line 148
    invoke-virtual/range {v6 .. v12}, Ltg8;->a(DDJ)V

    .line 149
    .line 150
    .line 151
    iget-boolean v1, v13, Ltg8;->c:Z

    .line 152
    .line 153
    if-ne v1, v3, :cond_6

    .line 154
    .line 155
    move v0, v3

    .line 156
    :cond_6
    iget-wide v6, v13, Ltg8;->b:J

    .line 157
    .line 158
    iget-wide v8, v13, Ltg8;->a:J

    .line 159
    .line 160
    add-long v18, v11, v20

    .line 161
    .line 162
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 163
    .line 164
    .line 165
    move-result-wide v14

    .line 166
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 167
    .line 168
    .line 169
    move-result-wide v16

    .line 170
    invoke-virtual/range {v13 .. v19}, Ltg8;->a(DDJ)V

    .line 171
    .line 172
    .line 173
    iget-wide v13, v13, Ltg8;->b:J

    .line 174
    .line 175
    const-wide/16 v15, -0x1

    .line 176
    .line 177
    cmp-long v1, v6, v15

    .line 178
    .line 179
    if-eqz v1, :cond_a

    .line 180
    .line 181
    cmp-long v1, v8, v15

    .line 182
    .line 183
    if-nez v1, :cond_7

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_7
    cmp-long v1, v11, v8

    .line 187
    .line 188
    if-lez v1, :cond_8

    .line 189
    .line 190
    move-wide v6, v13

    .line 191
    goto :goto_3

    .line 192
    :cond_8
    cmp-long v1, v11, v6

    .line 193
    .line 194
    if-lez v1, :cond_9

    .line 195
    .line 196
    move-wide v6, v8

    .line 197
    :cond_9
    :goto_3
    const-wide/32 v8, 0xea60

    .line 198
    .line 199
    .line 200
    add-long/2addr v6, v8

    .line 201
    goto :goto_5

    .line 202
    :cond_a
    :goto_4
    const-wide/32 v5, 0x2932e00

    .line 203
    .line 204
    .line 205
    add-long v6, v11, v5

    .line 206
    .line 207
    :goto_5
    iput-boolean v0, v4, Ldg;->a:Z

    .line 208
    .line 209
    iput-wide v6, v4, Ldg;->b:J

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_b
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    const/16 v4, 0xb

    .line 217
    .line 218
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    const/4 v4, 0x6

    .line 223
    if-lt v1, v4, :cond_c

    .line 224
    .line 225
    const/16 v4, 0x16

    .line 226
    .line 227
    if-lt v1, v4, :cond_d

    .line 228
    .line 229
    :cond_c
    move v0, v3

    .line 230
    :cond_d
    :goto_6
    if-eqz v0, :cond_e

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_e
    move v2, v3

    .line 234
    :goto_7
    return v2

    .line 235
    :pswitch_0
    check-cast v0, Landroid/os/PowerManager;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_f

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_f
    move v2, v3

    .line 245
    :goto_8
    return v2

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-byte v0, p0, Lsp;->c:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lsp;->d:Lwp;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1, v1}, Lwp;->m(ZZ)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-virtual {p0, v1, v1}, Lwp;->m(ZZ)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
