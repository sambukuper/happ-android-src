.class public final Lef8;
.super Ldf8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static f(Ljava/nio/ByteBuffer;)Lef8;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    new-instance v1, Lcf8;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, 0x32697254

    .line 15
    .line 16
    .line 17
    if-eq v2, v3, :cond_1

    .line 18
    .line 19
    const v3, 0x54726932

    .line 20
    .line 21
    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    const-string v2, "Buffer does not contain a serialized UTrie2"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 37
    .line 38
    if-ne v0, v2, :cond_2

    .line 39
    .line 40
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getChar()C

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iput v2, v1, Lcf8;->a:I

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getChar()C

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iput v2, v1, Lcf8;->b:I

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getChar()C

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iput v2, v1, Lcf8;->c:I

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getChar()C

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iput v2, v1, Lcf8;->d:I

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getChar()C

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iput v2, v1, Lcf8;->e:I

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getChar()C

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget v3, v1, Lcf8;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    and-int/lit8 v3, v3, 0xf

    .line 82
    .line 83
    const/4 v4, 0x1

    .line 84
    const-string v5, "UTrie2 serialized format error."

    .line 85
    .line 86
    if-gt v3, v4, :cond_9

    .line 87
    .line 88
    const/4 v6, 0x2

    .line 89
    if-nez v3, :cond_3

    .line 90
    .line 91
    :try_start_1
    new-instance v3, Lef8;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    move v7, v4

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    new-instance v3, Lff8;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    move v7, v6

    .line 104
    :goto_1
    iput-object v1, v3, Ldf8;->X:Lcf8;

    .line 105
    .line 106
    iget v8, v1, Lcf8;->b:I

    .line 107
    .line 108
    iput v8, v3, Ldf8;->g0:I

    .line 109
    .line 110
    iget v9, v1, Lcf8;->c:I

    .line 111
    .line 112
    shl-int/lit8 v6, v9, 0x2

    .line 113
    .line 114
    iput v6, v3, Ldf8;->h0:I

    .line 115
    .line 116
    iget v9, v1, Lcf8;->d:I

    .line 117
    .line 118
    iput v9, v3, Ldf8;->i0:I

    .line 119
    .line 120
    iget v1, v1, Lcf8;->e:I

    .line 121
    .line 122
    iput v1, v3, Ldf8;->n0:I

    .line 123
    .line 124
    shl-int/lit8 v1, v2, 0xb

    .line 125
    .line 126
    iput v1, v3, Ldf8;->l0:I

    .line 127
    .line 128
    add-int/lit8 v1, v6, -0x4

    .line 129
    .line 130
    iput v1, v3, Ldf8;->m0:I

    .line 131
    .line 132
    if-ne v7, v4, :cond_4

    .line 133
    .line 134
    add-int/2addr v1, v8

    .line 135
    iput v1, v3, Ldf8;->m0:I

    .line 136
    .line 137
    :cond_4
    if-ne v7, v4, :cond_5

    .line 138
    .line 139
    add-int/2addr v8, v6

    .line 140
    :cond_5
    invoke-static {v8, p0}, Lb33;->d(ILjava/nio/ByteBuffer;)[C

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iput-object v1, v3, Ldf8;->Y:[C

    .line 145
    .line 146
    if-ne v7, v4, :cond_6

    .line 147
    .line 148
    iget v1, v3, Ldf8;->g0:I

    .line 149
    .line 150
    iput v1, v3, Ldf8;->Z:I

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    iget v1, v3, Ldf8;->h0:I

    .line 154
    .line 155
    invoke-static {v1, p0}, Lb33;->f(ILjava/nio/ByteBuffer;)[I

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iput-object v1, v3, Ldf8;->f0:[I

    .line 160
    .line 161
    :goto_2
    invoke-static {v7}, Lp61;->B(I)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    const/16 v2, 0x80

    .line 166
    .line 167
    if-eqz v1, :cond_8

    .line 168
    .line 169
    if-ne v1, v4, :cond_7

    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    iput v1, v3, Ldf8;->Z:I

    .line 173
    .line 174
    iget-object v1, v3, Ldf8;->f0:[I

    .line 175
    .line 176
    iget v4, v3, Ldf8;->n0:I

    .line 177
    .line 178
    aget v4, v1, v4

    .line 179
    .line 180
    iput v4, v3, Ldf8;->j0:I

    .line 181
    .line 182
    aget v1, v1, v2

    .line 183
    .line 184
    iput v1, v3, Ldf8;->k0:I

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    invoke-direct {v1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v1

    .line 193
    :cond_8
    const/4 v1, 0x0

    .line 194
    iput-object v1, v3, Ldf8;->f0:[I

    .line 195
    .line 196
    iget-object v1, v3, Ldf8;->Y:[C

    .line 197
    .line 198
    iget v4, v3, Ldf8;->n0:I

    .line 199
    .line 200
    aget-char v4, v1, v4

    .line 201
    .line 202
    iput v4, v3, Ldf8;->j0:I

    .line 203
    .line 204
    iget v4, v3, Ldf8;->Z:I

    .line 205
    .line 206
    add-int/2addr v4, v2

    .line 207
    aget-char v1, v1, v4

    .line 208
    .line 209
    iput v1, v3, Ldf8;->k0:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    .line 211
    :goto_3
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 212
    .line 213
    .line 214
    check-cast v3, Lef8;

    .line 215
    .line 216
    return-object v3

    .line 217
    :cond_9
    :try_start_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 218
    .line 219
    invoke-direct {v1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    :goto_4
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 224
    .line 225
    .line 226
    throw v1
.end method
