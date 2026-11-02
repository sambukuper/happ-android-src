.class public final Loq7;
.super Le72;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzr7;


# instance fields
.field public final d:Lvz7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Le72;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lmq7;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lmq7;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lvz7;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Loq7;->d:Lvz7;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLs51;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, Lnq7;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lnq7;

    .line 9
    .line 10
    iget v2, v1, Lnq7;->h0:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lnq7;->h0:I

    .line 20
    .line 21
    :goto_0
    move-object v9, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lnq7;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lnq7;-><init>(Loq7;Ls51;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v9, Lnq7;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v1, v9, Lnq7;->h0:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast v0, Lsj6;

    .line 43
    .line 44
    iget-object p0, v0, Lsj6;->X:Ljava/lang/Object;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Loq7;->d:Lvz7;

    .line 57
    .line 58
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lzt7;

    .line 63
    .line 64
    invoke-virtual {v0, p2}, Lzt7;->a(Ljava/lang/String;)Lqs7;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    iget-object v1, v0, Lqs7;->g:Lms7;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-boolean v1, v1, Lms7;->a:Z

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move v1, v2

    .line 78
    :goto_2
    sget-object v4, Lss8;->a:Lss8;

    .line 79
    .line 80
    iget-object v4, p0, Le72;->a:Landroid/content/Context;

    .line 81
    .line 82
    invoke-static {v4}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget-object v6, v5, Lyf8;->X:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Lsu/happ/proxyutility/dto/HWID;

    .line 89
    .line 90
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iget-object v7, v5, Lyf8;->Y:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Lsu/happ/proxyutility/dto/VersionOS;

    .line 97
    .line 98
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    iget-object v5, v5, Lyf8;->Z:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 105
    .line 106
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    new-instance v8, Ljava/net/URL;

    .line 111
    .line 112
    invoke-direct {v8, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    iget-object p1, v0, Lqs7;->i:Lps7;

    .line 118
    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    iget-object v3, p1, Lps7;->a:Ljava/lang/String;

    .line 122
    .line 123
    :cond_4
    invoke-virtual {p0, v8, v3}, Le72;->e(Ljava/net/URL;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    const-string v1, "X-HWID"

    .line 130
    .line 131
    invoke-virtual {p1, v1, v6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {v4}, Lue3;->y(Landroid/content/Context;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    const-string v1, "AndroidTV"

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_5
    const-string v1, "Android"

    .line 145
    .line 146
    :goto_3
    const-string v3, "X-Device-OS"

    .line 147
    .line 148
    invoke-virtual {p1, v3, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-string v1, "X-Ver-OS"

    .line 153
    .line 154
    invoke-virtual {p1, v1, v7}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const-string v1, "X-Device-model"

    .line 159
    .line 160
    invoke-virtual {p1, v1, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :cond_6
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    sget-object v3, Lkw4;->a:Lkw4;

    .line 169
    .line 170
    invoke-static {p2}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    if-eqz p2, :cond_7

    .line 175
    .line 176
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->U()Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    goto :goto_4

    .line 181
    :cond_7
    const/4 p2, 0x0

    .line 182
    :goto_4
    if-eqz v0, :cond_8

    .line 183
    .line 184
    iget v0, v0, Lqs7;->h:I

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_8
    const/4 v0, 0x7

    .line 188
    :goto_5
    new-instance v3, Ljava/lang/Integer;

    .line 189
    .line 190
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 194
    .line 195
    .line 196
    move-result-wide v3

    .line 197
    const-wide/16 v5, 0x3e8

    .line 198
    .line 199
    mul-long/2addr v3, v5

    .line 200
    new-instance v0, Ljava/lang/Long;

    .line 201
    .line 202
    invoke-direct {v0, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 203
    .line 204
    .line 205
    new-instance v8, Liq1;

    .line 206
    .line 207
    const/4 v3, 0x3

    .line 208
    invoke-direct {v8, v3, v1, p1, p2}, Liq1;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 209
    .line 210
    .line 211
    iput v2, v9, Lnq7;->h0:I

    .line 212
    .line 213
    move-object v2, p0

    .line 214
    move-object v4, p3

    .line 215
    move-object v5, p4

    .line 216
    move-object v6, p5

    .line 217
    move/from16 v7, p6

    .line 218
    .line 219
    move-object v3, v0

    .line 220
    invoke-static/range {v2 .. v9}, Le72;->d(Le72;Ljava/lang/Long;Ljava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLdn2;Ls51;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    sget-object p1, Lc71;->X:Lc71;

    .line 225
    .line 226
    if-ne p0, p1, :cond_9

    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_9
    return-object p0
.end method
