.class public final synthetic Lbz0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lun2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lbz0;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final N(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, Lbz0;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x492

    .line 5
    .line 6
    const/16 v2, 0x80

    .line 7
    .line 8
    const/16 v3, 0x100

    .line 9
    .line 10
    const/16 v4, 0x10

    .line 11
    .line 12
    const/16 v5, 0x20

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x1

    .line 17
    sget-object v9, Ldn8;->a:Ldn8;

    .line 18
    .line 19
    packed-switch p0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p1, Landroid/content/Context;

    .line 23
    .line 24
    check-cast p2, Landroid/content/pm/ResolveInfo;

    .line 25
    .line 26
    check-cast p3, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    check-cast p4, Ljava/lang/CharSequence;

    .line 33
    .line 34
    check-cast p5, Lf88;

    .line 35
    .line 36
    iget-wide v0, p5, Lf88;->a:J

    .line 37
    .line 38
    invoke-static {v0, v1}, Lf88;->d(J)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    invoke-static {v0, v1}, Lf88;->c(J)I

    .line 43
    .line 44
    .line 45
    move-result p5

    .line 46
    invoke-interface {p4, p3, p5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    new-instance p4, Landroid/content/Intent;

    .line 55
    .line 56
    invoke-direct {p4}, Landroid/content/Intent;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string p5, "android.intent.action.PROCESS_TEXT"

    .line 60
    .line 61
    invoke-virtual {p4, p5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    const-string p5, "text/plain"

    .line 66
    .line 67
    invoke-virtual {p4, p5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    const-string p5, "android.intent.extra.PROCESS_TEXT_READONLY"

    .line 72
    .line 73
    invoke-virtual {p4, p5, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p2, p2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 78
    .line 79
    iget-object p4, p2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p2, p2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0, p4, p2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-string p2, "android.intent.extra.PROCESS_TEXT"

    .line 88
    .line 89
    invoke-virtual {p0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 93
    .line 94
    .line 95
    return-object v9

    .line 96
    :pswitch_0
    check-cast p1, Lt38;

    .line 97
    .line 98
    check-cast p2, Lh38;

    .line 99
    .line 100
    check-cast p3, Ldn2;

    .line 101
    .line 102
    check-cast p4, Llp2;

    .line 103
    .line 104
    check-cast p5, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    and-int/lit8 p5, p0, 0x6

    .line 111
    .line 112
    if-nez p5, :cond_2

    .line 113
    .line 114
    and-int/lit8 p5, p0, 0x8

    .line 115
    .line 116
    if-nez p5, :cond_0

    .line 117
    .line 118
    invoke-virtual {p4, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p5

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p4, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p5

    .line 127
    :goto_0
    if-eqz p5, :cond_1

    .line 128
    .line 129
    move v6, v7

    .line 130
    :cond_1
    or-int p5, p0, v6

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    move p5, p0

    .line 134
    :goto_1
    and-int/lit8 v6, p0, 0x30

    .line 135
    .line 136
    if-nez v6, :cond_5

    .line 137
    .line 138
    and-int/lit8 v6, p0, 0x40

    .line 139
    .line 140
    if-nez v6, :cond_3

    .line 141
    .line 142
    invoke-virtual {p4, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    invoke-virtual {p4, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    :goto_2
    if-eqz v6, :cond_4

    .line 152
    .line 153
    move v4, v5

    .line 154
    :cond_4
    or-int/2addr p5, v4

    .line 155
    :cond_5
    and-int/lit16 p0, p0, 0x180

    .line 156
    .line 157
    if-nez p0, :cond_7

    .line 158
    .line 159
    invoke-virtual {p4, p3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_6

    .line 164
    .line 165
    move v2, v3

    .line 166
    :cond_6
    or-int/2addr p5, v2

    .line 167
    :cond_7
    and-int/lit16 p0, p5, 0x493

    .line 168
    .line 169
    if-eq p0, v1, :cond_8

    .line 170
    .line 171
    move v0, v8

    .line 172
    :cond_8
    and-int/lit8 p0, p5, 0x1

    .line 173
    .line 174
    invoke-virtual {p4, p0, v0}, Llp2;->N(IZ)Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_9

    .line 179
    .line 180
    and-int/lit16 p0, p5, 0x3fe

    .line 181
    .line 182
    check-cast p1, Lh30;

    .line 183
    .line 184
    invoke-static {p1, p2, p3, p4, p0}, Lng1;->c(Lh30;Lh38;Ldn2;Llp2;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_9
    invoke-virtual {p4}, Llp2;->Q()V

    .line 189
    .line 190
    .line 191
    :goto_3
    return-object v9

    .line 192
    :pswitch_1
    check-cast p1, Lt38;

    .line 193
    .line 194
    check-cast p2, Lh38;

    .line 195
    .line 196
    check-cast p3, Ldn2;

    .line 197
    .line 198
    check-cast p4, Llp2;

    .line 199
    .line 200
    check-cast p5, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    and-int/lit8 p5, p0, 0x6

    .line 207
    .line 208
    if-nez p5, :cond_c

    .line 209
    .line 210
    and-int/lit8 p5, p0, 0x8

    .line 211
    .line 212
    if-nez p5, :cond_a

    .line 213
    .line 214
    invoke-virtual {p4, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p5

    .line 218
    goto :goto_4

    .line 219
    :cond_a
    invoke-virtual {p4, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p5

    .line 223
    :goto_4
    if-eqz p5, :cond_b

    .line 224
    .line 225
    move v6, v7

    .line 226
    :cond_b
    or-int p5, p0, v6

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_c
    move p5, p0

    .line 230
    :goto_5
    and-int/lit8 v6, p0, 0x30

    .line 231
    .line 232
    if-nez v6, :cond_f

    .line 233
    .line 234
    and-int/lit8 v6, p0, 0x40

    .line 235
    .line 236
    if-nez v6, :cond_d

    .line 237
    .line 238
    invoke-virtual {p4, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    goto :goto_6

    .line 243
    :cond_d
    invoke-virtual {p4, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    :goto_6
    if-eqz v6, :cond_e

    .line 248
    .line 249
    move v4, v5

    .line 250
    :cond_e
    or-int/2addr p5, v4

    .line 251
    :cond_f
    and-int/lit16 p0, p0, 0x180

    .line 252
    .line 253
    if-nez p0, :cond_11

    .line 254
    .line 255
    invoke-virtual {p4, p3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-eqz p0, :cond_10

    .line 260
    .line 261
    move v2, v3

    .line 262
    :cond_10
    or-int/2addr p5, v2

    .line 263
    :cond_11
    and-int/lit16 p0, p5, 0x493

    .line 264
    .line 265
    if-eq p0, v1, :cond_12

    .line 266
    .line 267
    move v0, v8

    .line 268
    :cond_12
    and-int/lit8 p0, p5, 0x1

    .line 269
    .line 270
    invoke-virtual {p4, p0, v0}, Llp2;->N(IZ)Z

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    if-eqz p0, :cond_13

    .line 275
    .line 276
    and-int/lit16 p0, p5, 0x3fe

    .line 277
    .line 278
    check-cast p1, Lh30;

    .line 279
    .line 280
    invoke-static {p1, p2, p3, p4, p0}, Lng1;->c(Lh30;Lh38;Ldn2;Llp2;I)V

    .line 281
    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_13
    invoke-virtual {p4}, Llp2;->Q()V

    .line 285
    .line 286
    .line 287
    :goto_7
    return-object v9

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
