.class public final synthetic Lf98;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lf98;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lf98;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lf98;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lf98;->X:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, Lf98;->Z:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v0, v0, Lf98;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, Lkd8;

    .line 14
    .line 15
    check-cast v3, Lqe4;

    .line 16
    .line 17
    iget-object v1, v0, Lkd8;->a:Ly68;

    .line 18
    .line 19
    invoke-virtual {v1}, Ly68;->c()Lh48;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v0, v0, Lkd8;->e:Lrh5;

    .line 24
    .line 25
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lr07;

    .line 30
    .line 31
    new-instance v4, Lqf3;

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    invoke-direct {v4, v5}, Lqf3;-><init>(B)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    move v7, v6

    .line 44
    :goto_0
    iget-object v8, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 45
    .line 46
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-ge v6, v8, :cond_3

    .line 51
    .line 52
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const/16 v9, 0xa

    .line 60
    .line 61
    if-ne v8, v9, :cond_0

    .line 62
    .line 63
    const/16 v9, 0x20

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    const/16 v9, 0xd

    .line 67
    .line 68
    if-ne v8, v9, :cond_1

    .line 69
    .line 70
    const v9, 0xfeff

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v9, v8

    .line 75
    :goto_1
    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-eq v9, v8, :cond_2

    .line 80
    .line 81
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    add-int/2addr v11, v10

    .line 94
    invoke-virtual {v4, v8, v11, v7}, Lqf3;->i(III)V

    .line 95
    .line 96
    .line 97
    move v7, v2

    .line 98
    :cond_2
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    add-int/2addr v6, v10

    .line 102
    goto :goto_0

    .line 103
    :cond_3
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-eqz v7, :cond_4

    .line 108
    .line 109
    move-object v9, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move-object v9, v1

    .line 112
    :goto_2
    const/4 v2, 0x0

    .line 113
    if-ne v9, v1, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    iget-wide v5, v1, Lh48;->f0:J

    .line 117
    .line 118
    invoke-static {v5, v6, v4, v0}, Lqp7;->i(JLqf3;Lr07;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v10

    .line 122
    iget-object v1, v1, Lh48;->g0:Lf88;

    .line 123
    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    iget-wide v1, v1, Lf88;->a:J

    .line 127
    .line 128
    invoke-static {v1, v2, v4, v0}, Lqp7;->i(JLqf3;Lr07;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v0

    .line 132
    new-instance v2, Lf88;

    .line 133
    .line 134
    invoke-direct {v2, v0, v1}, Lf88;-><init>(J)V

    .line 135
    .line 136
    .line 137
    :cond_6
    move-object v12, v2

    .line 138
    new-instance v8, Lh48;

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x78

    .line 146
    .line 147
    invoke-direct/range {v8 .. v17}, Lh48;-><init>(Ljava/lang/CharSequence;JLf88;Lqg5;Ljava/util/List;Ljava/util/List;Lc78;I)V

    .line 148
    .line 149
    .line 150
    new-instance v2, Lid8;

    .line 151
    .line 152
    invoke-direct {v2, v8, v4}, Lid8;-><init>(Lh48;Lqf3;)V

    .line 153
    .line 154
    .line 155
    :goto_3
    return-object v2

    .line 156
    :pswitch_0
    check-cast v0, Lb8;

    .line 157
    .line 158
    check-cast v3, Lwj0;

    .line 159
    .line 160
    iget-object v0, v0, Lb8;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Lpj0;

    .line 163
    .line 164
    iget-object v0, v0, Lpj0;->a:Ljava/util/concurrent/Executor;

    .line 165
    .line 166
    if-nez v0, :cond_7

    .line 167
    .line 168
    sget-object v0, Luh;->b:Ljava/util/concurrent/ThreadFactory;

    .line 169
    .line 170
    const-string v1, "CXCP-Camera-E"

    .line 171
    .line 172
    invoke-static {v0, v1}, Luh;->b(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;)Lth;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v1, Lsh;

    .line 177
    .line 178
    const/4 v4, -0x3

    .line 179
    invoke-direct {v1, v4, v0}, Lsh;-><init>(ILth;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v2, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v1, Lfl6;

    .line 190
    .line 191
    const/16 v2, 0xf

    .line 192
    .line 193
    invoke-direct {v1, v0, v2}, Lfl6;-><init>(Ljava/lang/Object;B)V

    .line 194
    .line 195
    .line 196
    sget-object v2, Luj0;->Z:Luj0;

    .line 197
    .line 198
    invoke-virtual {v3, v2, v1}, Lwj0;->a(Luj0;Ljava/lang/Runnable;)V

    .line 199
    .line 200
    .line 201
    :cond_7
    return-object v0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
