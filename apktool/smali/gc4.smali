.class public final Lgc4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput-byte v0, p0, Lgc4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lav0;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lgc4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lgc4;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lgc4;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lgc4;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lhc4;Lec4;Lr43;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lgc4;->X:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc4;->f0:Ljava/lang/Object;

    iput-object p2, p0, Lgc4;->Y:Ljava/lang/Object;

    iput-object p3, p0, Lgc4;->Z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-byte v0, p0, Lgc4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgc4;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lav0;

    .line 11
    .line 12
    iget-object v3, v0, Lav0;->X:Landroid/content/Intent;

    .line 13
    .line 14
    const-string v4, "google.message_id"

    .line 15
    .line 16
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    const-string v4, "message_id"

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Lg28;->l(Ljava/lang/Object;)Lfb9;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v3, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, Lav0;->X:Landroid/content/Intent;

    .line 45
    .line 46
    const-string v5, "google.message_id"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    const-string v5, "message_id"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :cond_2
    const-string v4, "google.message_id"

    .line 61
    .line 62
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, Lav0;->X:Landroid/content/Intent;

    .line 66
    .line 67
    const-string v4, "google.product_id"

    .line 68
    .line 69
    invoke-virtual {v0, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :cond_3
    if-eqz v1, :cond_4

    .line 84
    .line 85
    const-string v0, "google.product_id"

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v3, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    :cond_4
    iget-object v0, p0, Lgc4;->Y:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Landroid/content/Context;

    .line 97
    .line 98
    const-string v1, "supports_message_handled"

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    invoke-virtual {v3, v1, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Leb9;->n(Landroid/content/Context;)Leb9;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, Lbb9;

    .line 109
    .line 110
    monitor-enter v0

    .line 111
    :try_start_0
    iget v4, v0, Leb9;->Y:I

    .line 112
    .line 113
    add-int/lit8 v5, v4, 0x1

    .line 114
    .line 115
    iput v5, v0, Leb9;->Y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    monitor-exit v0

    .line 118
    const/4 v5, 0x2

    .line 119
    invoke-direct {v1, v4, v5, v3, v2}, Lbb9;-><init>(IILandroid/os/Bundle;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Leb9;->o(Lbb9;)Lfb9;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_0
    iget-object p0, p0, Lgc4;->f0:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 129
    .line 130
    sget-object v1, Ldp1;->g0:Ldp1;

    .line 131
    .line 132
    new-instance v2, Lrb8;

    .line 133
    .line 134
    const/16 v3, 0xc

    .line 135
    .line 136
    invoke-direct {v2, p0, v3}, Lrb8;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Lfb9;->b(Ljava/util/concurrent/Executor;Lfa5;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :catchall_0
    move-exception p0

    .line 144
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    throw p0

    .line 146
    :pswitch_0
    :try_start_2
    iget-object v0, p0, Lgc4;->Y:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lqi2;

    .line 149
    .line 150
    invoke-virtual {v0}, Lqi2;->call()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 154
    :catch_0
    iget-object v0, p0, Lgc4;->Z:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Lay1;

    .line 157
    .line 158
    iget-object p0, p0, Lgc4;->f0:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Landroid/os/Handler;

    .line 161
    .line 162
    new-instance v2, Lzo2;

    .line 163
    .line 164
    const/16 v3, 0xb

    .line 165
    .line 166
    invoke-direct {v2, v0, v1, v3}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_1
    iget-object v0, p0, Lgc4;->Y:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lec4;

    .line 176
    .line 177
    invoke-virtual {v0}, Lec4;->a()Lxb4;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v1, Lzo2;

    .line 182
    .line 183
    const/16 v3, 0xa

    .line 184
    .line 185
    invoke-direct {v1, v3, p0, v0, v2}, Lzo2;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 186
    .line 187
    .line 188
    iget-object p0, p0, Lgc4;->f0:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p0, Lhc4;

    .line 191
    .line 192
    iget-object p0, p0, Lhc4;->j:Ly5;

    .line 193
    .line 194
    iget-object p0, p0, Ly5;->Y:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, Lh37;

    .line 197
    .line 198
    invoke-interface {v0, v1, p0}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
