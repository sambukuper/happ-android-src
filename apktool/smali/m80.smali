.class public final Lm80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzf3;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld61;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lm80;->a:B

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm80;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lm80;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lm80;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ly76;)Lzf6;
    .locals 12

    .line 1
    iget-byte v0, p0, Lm80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lm80;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "Host"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Ly76;->e:Ly5;

    .line 11
    .line 12
    invoke-virtual {v0}, Ly5;->V()Lz47;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lz47;->o()Ly5;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Ly76;->b(Ly5;)Lzf6;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p0, Ld61;

    .line 31
    .line 32
    iget-object v0, p1, Ly76;->e:Ly5;

    .line 33
    .line 34
    invoke-virtual {v0}, Ly5;->V()Lz47;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, v0, Ly5;->Y:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lu23;

    .line 41
    .line 42
    iget-object v4, v0, Ly5;->g0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Lnz2;

    .line 45
    .line 46
    invoke-virtual {v4, v1}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const/4 v6, 0x0

    .line 51
    if-nez v5, :cond_0

    .line 52
    .line 53
    invoke-static {v3, v6}, Lks8;->t(Lu23;Z)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v2, v1, v5}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    const-string v1, "Connection"

    .line 61
    .line 62
    invoke-virtual {v4, v1}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    const-string v5, "Keep-Alive"

    .line 69
    .line 70
    invoke-virtual {v2, v1, v5}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const-string v1, "Accept-Encoding"

    .line 74
    .line 75
    invoke-virtual {v4, v1}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const-string v7, "gzip"

    .line 80
    .line 81
    if-nez v5, :cond_2

    .line 82
    .line 83
    const-string v5, "Range"

    .line 84
    .line 85
    invoke-virtual {v4, v5}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-nez v5, :cond_2

    .line 90
    .line 91
    invoke-virtual {v2, v1, v7}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    goto :goto_0

    .line 96
    :cond_2
    move v1, v6

    .line 97
    :goto_0
    invoke-interface {p0, v3}, Ld61;->t(Lu23;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-nez v8, :cond_6

    .line 106
    .line 107
    new-instance v8, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    move v9, v6

    .line 117
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_5

    .line 122
    .line 123
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    add-int/lit8 v11, v9, 0x1

    .line 128
    .line 129
    if-ltz v9, :cond_4

    .line 130
    .line 131
    check-cast v10, Lc61;

    .line 132
    .line 133
    if-lez v9, :cond_3

    .line 134
    .line 135
    const-string v9, "; "

    .line 136
    .line 137
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :cond_3
    iget-object v9, v10, Lc61;->a:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v9, 0x3d

    .line 146
    .line 147
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v9, v10, Lc61;->b:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    move v9, v11

    .line 156
    goto :goto_1

    .line 157
    :cond_4
    invoke-static {}, Li21;->X()V

    .line 158
    .line 159
    .line 160
    const/4 p0, 0x0

    .line 161
    throw p0

    .line 162
    :cond_5
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    const-string v8, "Cookie"

    .line 167
    .line 168
    invoke-virtual {v2, v8, v5}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    const-string v5, "User-Agent"

    .line 172
    .line 173
    invoke-virtual {v4, v5}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    if-nez v4, :cond_7

    .line 178
    .line 179
    const-string v4, "okhttp/4.12.0"

    .line 180
    .line 181
    invoke-virtual {v2, v5, v4}, Lz47;->M(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-virtual {v2}, Lz47;->o()Ly5;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {p1, v2}, Ly76;->b(Ly5;)Lzf6;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iget-object v2, p1, Lzf6;->h0:Lnz2;

    .line 193
    .line 194
    invoke-static {p0, v3, v2}, Ls23;->b(Ld61;Lu23;Lnz2;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Lzf6;->k()Lyf6;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    iput-object v0, p0, Lyf6;->a:Ly5;

    .line 202
    .line 203
    if-eqz v1, :cond_8

    .line 204
    .line 205
    const-string v0, "Content-Encoding"

    .line 206
    .line 207
    invoke-static {p1, v0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v7, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_8

    .line 216
    .line 217
    invoke-static {p1}, Ls23;->a(Lzf6;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    iget-object v1, p1, Lzf6;->i0:Lb86;

    .line 224
    .line 225
    if-eqz v1, :cond_8

    .line 226
    .line 227
    new-instance v3, Ldv2;

    .line 228
    .line 229
    invoke-virtual {v1}, Lb86;->source()Lba0;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-direct {v3, v1}, Ldv2;-><init>(Lje7;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Lnz2;->c()Lps;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1, v0}, Lps;->e(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const-string v0, "Content-Length"

    .line 244
    .line 245
    invoke-virtual {v1, v0}, Lps;->e(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Lps;->d()Lnz2;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Lnz2;->c()Lps;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iput-object v0, p0, Lyf6;->f:Lps;

    .line 257
    .line 258
    const-string v0, "Content-Type"

    .line 259
    .line 260
    invoke-static {p1, v0}, Lzf6;->g(Lzf6;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    new-instance p1, Lb86;

    .line 264
    .line 265
    new-instance v0, Lj76;

    .line 266
    .line 267
    invoke-direct {v0, v3}, Lj76;-><init>(Lje7;)V

    .line 268
    .line 269
    .line 270
    const-wide/16 v1, -0x1

    .line 271
    .line 272
    invoke-direct {p1, v1, v2, v0, v6}, Lb86;-><init>(JLba0;B)V

    .line 273
    .line 274
    .line 275
    iput-object p1, p0, Lyf6;->g:Lb86;

    .line 276
    .line 277
    :cond_8
    invoke-virtual {p0}, Lyf6;->a()Lzf6;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    return-object p0

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
