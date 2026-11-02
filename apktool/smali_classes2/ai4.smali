.class public final Lai4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:[Ljava/lang/String;

.field public final synthetic Z:Lci4;

.field public final synthetic f0:Ls61;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;Lci4;Ls61;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lai4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lai4;->Y:[Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lai4;->Z:Lci4;

    .line 6
    .line 7
    iput-object p3, p0, Lai4;->f0:Ls61;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lai4;->X:B

    .line 2
    .line 3
    const-string v1, "Check failed."

    .line 4
    .line 5
    const-string v2, "logcat"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v5, Lps;

    .line 17
    .line 18
    invoke-direct {v5, v3}, Lps;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v5, v2}, Lps;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lai4;->Y:[Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v5, v2}, Lps;->c(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v5, Lps;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    new-array v2, v2, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, v5, Lps;->b:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v2, p0, Lai4;->Z:Lci4;

    .line 50
    .line 51
    iput-object v0, v2, Lci4;->h:Ljava/lang/Process;

    .line 52
    .line 53
    :try_start_0
    iget-object v2, p0, Lai4;->f0:Ls61;

    .line 54
    .line 55
    invoke-static {v2}, Lu70;->I(Ls61;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v5, Liq0;->a:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    new-instance v6, Ljava/io/InputStreamReader;

    .line 76
    .line 77
    invoke-direct {v6, v3, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, Ljava/io/BufferedReader;

    .line 81
    .line 82
    const/16 v5, 0x2000

    .line 83
    .line 84
    invoke-direct {v3, v6, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 85
    .line 86
    .line 87
    :try_start_1
    invoke-static {v3}, Ldt7;->c(Ljava/io/BufferedReader;)Lu27;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lt21;

    .line 92
    .line 93
    invoke-virtual {v5}, Lt21;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_1

    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const/16 v6, 0xa

    .line 113
    .line 114
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    const/16 v7, 0x7530

    .line 122
    .line 123
    if-le v6, v7, :cond_0

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    sub-int/2addr v6, v7

    .line 130
    const/4 v7, 0x0

    .line 131
    invoke-virtual {v2, v7, v6}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :catchall_0
    move-exception v1

    .line 136
    goto :goto_1

    .line 137
    :cond_1
    :try_start_2
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_2

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    .line 151
    .line 152
    .line 153
    iget-object p0, p0, Lai4;->Z:Lci4;

    .line 154
    .line 155
    iput-object v4, p0, Lci4;->h:Ljava/lang/Process;

    .line 156
    .line 157
    return-object v1

    .line 158
    :catchall_1
    move-exception v1

    .line 159
    goto :goto_2

    .line 160
    :cond_2
    :try_start_3
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 166
    :goto_1
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 167
    :catchall_2
    move-exception v2

    .line 168
    :try_start_5
    invoke-static {v3, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 172
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    .line 173
    .line 174
    .line 175
    iget-object p0, p0, Lai4;->Z:Lci4;

    .line 176
    .line 177
    iput-object v4, p0, Lci4;->h:Ljava/lang/Process;

    .line 178
    .line 179
    throw v1

    .line 180
    :pswitch_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v5, Lps;

    .line 185
    .line 186
    invoke-direct {v5, v3}, Lps;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v2}, Lps;->b(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v2, p0, Lai4;->Y:[Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v5, v2}, Lps;->c(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    iget-object v2, v5, Lps;->b:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    new-array v2, v2, [Ljava/lang/String;

    .line 204
    .line 205
    iget-object v3, v5, Lps;->b:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, [Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v2, p0, Lai4;->Z:Lci4;

    .line 218
    .line 219
    iput-object v0, v2, Lci4;->h:Ljava/lang/Process;

    .line 220
    .line 221
    :try_start_6
    iget-object v2, p0, Lai4;->f0:Ls61;

    .line 222
    .line 223
    invoke-static {v2}, Lu70;->I(Ls61;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    .line 230
    .line 231
    .line 232
    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 233
    if-nez v2, :cond_3

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    .line 236
    .line 237
    .line 238
    iget-object p0, p0, Lai4;->Z:Lci4;

    .line 239
    .line 240
    iput-object v4, p0, Lci4;->h:Ljava/lang/Process;

    .line 241
    .line 242
    const-string p0, ""

    .line 243
    .line 244
    return-object p0

    .line 245
    :cond_3
    :try_start_7
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 251
    :catchall_3
    move-exception v1

    .line 252
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    .line 253
    .line 254
    .line 255
    iget-object p0, p0, Lai4;->Z:Lci4;

    .line 256
    .line 257
    iput-object v4, p0, Lci4;->h:Ljava/lang/Process;

    .line 258
    .line 259
    throw v1

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
