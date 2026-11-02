.class public final synthetic Lte1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lue1;


# direct methods
.method public synthetic constructor <init>(Lue1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lte1;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lte1;->b:Lue1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lte1;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lte1;->b:Lue1;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object p0, v0, Lue1;->a:Lh44;

    .line 10
    .line 11
    invoke-virtual {p0}, Lh44;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lsz2;

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iget-object v3, v0, Lue1;->c:Lw06;

    .line 22
    .line 23
    invoke-interface {v3}, Lw06;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lrg1;

    .line 28
    .line 29
    invoke-virtual {v3}, Lrg1;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :try_start_1
    invoke-static {v1, v2}, Lsz2;->b(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ljs5;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Lsz2;->a:Lak3;

    .line 44
    .line 45
    new-instance v5, Lsn;

    .line 46
    .line 47
    invoke-direct {v5, p0, v1, v3, v2}, Lsn;-><init>(Lsz2;Ljava/lang/String;Ljava/lang/String;Ljs5;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v5}, Lak3;->a(Lgn2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    :try_start_2
    monitor-exit p0

    .line 54
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception v1

    .line 60
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 61
    :try_start_4
    throw v1

    .line 62
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 63
    throw p0

    .line 64
    :pswitch_0
    iget-object p0, p0, Lte1;->b:Lue1;

    .line 65
    .line 66
    monitor-enter p0

    .line 67
    :try_start_5
    iget-object v0, p0, Lue1;->a:Lh44;

    .line 68
    .line 69
    invoke-virtual {v0}, Lh44;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lsz2;

    .line 74
    .line 75
    invoke-virtual {v0}, Lsz2;->a()Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    monitor-enter v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 80
    :try_start_6
    iget-object v2, v0, Lsz2;->a:Lak3;

    .line 81
    .line 82
    new-instance v3, Lya2;

    .line 83
    .line 84
    const/16 v4, 0x13

    .line 85
    .line 86
    invoke-direct {v3, v0, v4}, Lya2;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Lak3;->a(Lgn2;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 90
    .line 91
    .line 92
    :try_start_7
    monitor-exit v0

    .line 93
    new-instance v0, Lorg/json/JSONArray;

    .line 94
    .line 95
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 96
    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-ge v2, v3, :cond_0

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lmy;

    .line 110
    .line 111
    new-instance v4, Lorg/json/JSONObject;

    .line 112
    .line 113
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v5, "agent"

    .line 117
    .line 118
    iget-object v6, v3, Lmy;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    const-string v5, "dates"

    .line 124
    .line 125
    new-instance v6, Lorg/json/JSONArray;

    .line 126
    .line 127
    iget-object v3, v3, Lmy;->b:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v6, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :catchall_2
    move-exception v0

    .line 142
    goto :goto_5

    .line 143
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 144
    .line 145
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v2, "heartbeats"

    .line 149
    .line 150
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    const-string v0, "version"

    .line 154
    .line 155
    const-string v2, "2"

    .line 156
    .line 157
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v2, Landroid/util/Base64OutputStream;

    .line 166
    .line 167
    const/16 v3, 0xb

    .line 168
    .line 169
    invoke-direct {v2, v0, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 170
    .line 171
    .line 172
    :try_start_8
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    .line 173
    .line 174
    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 175
    .line 176
    .line 177
    :try_start_9
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-string v4, "UTF-8"

    .line 182
    .line 183
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 188
    .line 189
    .line 190
    :try_start_a
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 191
    .line 192
    .line 193
    :try_start_b
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V

    .line 194
    .line 195
    .line 196
    const-string v1, "UTF-8"

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 203
    return-object v0

    .line 204
    :catchall_3
    move-exception v0

    .line 205
    goto :goto_3

    .line 206
    :catchall_4
    move-exception v0

    .line 207
    :try_start_c
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :catchall_5
    move-exception v1

    .line 212
    :try_start_d
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    :goto_2
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 216
    :goto_3
    :try_start_e
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :catchall_6
    move-exception v1

    .line 221
    :try_start_f
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    :goto_4
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 225
    :catchall_7
    move-exception v1

    .line 226
    :try_start_10
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 227
    :try_start_11
    throw v1

    .line 228
    :goto_5
    monitor-exit p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 229
    throw v0

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
