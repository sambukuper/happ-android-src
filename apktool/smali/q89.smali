.class public final Lq89;
.super Lg89;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lps2;
.implements Lqs2;


# static fields
.field public static final o:Lz79;


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Landroid/os/Handler;

.field public final j:Lz79;

.field public final k:Ljava/util/Set;

.field public final l:Lfu6;

.field public m:Lz87;

.field public n:Lbl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lr89;->a:Lz79;

    .line 2
    .line 3
    sput-object v0, Lq89;->o:Lz79;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lf99;Lfu6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lg89;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lq89;->h:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lq89;->i:Landroid/os/Handler;

    .line 12
    .line 13
    iput-object p3, p0, Lq89;->l:Lfu6;

    .line 14
    .line 15
    iget-object p1, p3, Lfu6;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/util/Set;

    .line 18
    .line 19
    iput-object p1, p0, Lq89;->k:Ljava/util/Set;

    .line 20
    .line 21
    sget-object p1, Lq89;->o:Lz79;

    .line 22
    .line 23
    iput-object p1, p0, Lq89;->j:Lz79;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final b(Lx11;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lq89;->n:Lbl;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbl;->j(Lx11;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lq89;->n:Lbl;

    .line 2
    .line 3
    iget-object v0, p0, Lbl;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lrs2;

    .line 6
    .line 7
    iget-object v0, v0, Lrs2;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    iget-object p0, p0, Lbl;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lqn;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Li89;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p0, Li89;->o:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance p1, Lx11;

    .line 26
    .line 27
    const/16 v0, 0x11

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {p1, v0, v1, v1}, Lx11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Li89;->m(Lx11;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {p0, p1}, Li89;->f(I)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 10

    .line 1
    iget-object v0, p0, Lq89;->m:Lz87;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "<<default account>>"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    :try_start_0
    iget-object v5, v0, Lz87;->A:Lfu6;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v5, Landroid/accounts/Account;

    .line 17
    .line 18
    const-string v6, "com.google"

    .line 19
    .line 20
    invoke-direct {v5, v1, v6}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v6, v5, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v1, v0, Lu10;->c:Landroid/content/Context;

    .line 32
    .line 33
    sget-object v6, Lvj7;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 34
    .line 35
    invoke-static {v1}, Lw45;->s(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v6, Lvj7;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :try_start_1
    sget-object v7, Lvj7;->d:Lvj7;

    .line 44
    .line 45
    if-nez v7, :cond_0

    .line 46
    .line 47
    new-instance v7, Lvj7;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v7, v1}, Lvj7;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    sput-object v7, Lvj7;->d:Lvj7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    :goto_0
    :try_start_2
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 62
    .line 63
    .line 64
    const-string v1, "defaultGoogleSignInAccount"

    .line 65
    .line 66
    invoke-virtual {v7, v1}, Lvj7;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    new-instance v8, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const/16 v9, 0x14

    .line 88
    .line 89
    add-int/2addr v9, v6

    .line 90
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 91
    .line 92
    .line 93
    const-string v6, "googleSignInAccount:"

    .line 94
    .line 95
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v7, v1}, Lvj7;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    :try_start_3
    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->c(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 112
    .line 113
    .line 114
    move-result-object v1
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 115
    goto :goto_3

    .line 116
    :goto_1
    :try_start_4
    invoke-virtual {v6}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    goto :goto_4

    .line 122
    :catch_1
    :cond_2
    :goto_2
    move-object v1, v4

    .line 123
    :goto_3
    new-instance v6, Lj99;

    .line 124
    .line 125
    iget-object v7, v0, Lz87;->C:Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-static {v7}, Lw45;->s(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    const/4 v8, 0x2

    .line 135
    invoke-direct {v6, v8, v5, v7, v1}, Lj99;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lu10;->h()Landroid/os/IInterface;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Lt89;

    .line 143
    .line 144
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v5, v0, Lb89;->h:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    sget v5, Ln89;->a:I

    .line 154
    .line 155
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    .line 157
    .line 158
    const/16 v5, 0x4f45

    .line 159
    .line 160
    invoke-static {v1, v5}, Lmb6;->s0(Landroid/os/Parcel;I)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    const/4 v7, 0x4

    .line 165
    invoke-static {v1, v3, v7}, Lmb6;->r0(Landroid/os/Parcel;II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    .line 170
    .line 171
    invoke-static {v1, v8, v6, v2}, Lmb6;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v5}, Lmb6;->t0(Landroid/os/Parcel;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, p0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 181
    .line 182
    .line 183
    move-result-object v5
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0

    .line 184
    :try_start_5
    iget-object v0, v0, Lb89;->g:Landroid/os/IBinder;

    .line 185
    .line 186
    const/16 v6, 0xc

    .line 187
    .line 188
    invoke-interface {v0, v6, v1, v5, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Landroid/os/Parcel;->readException()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 192
    .line 193
    .line 194
    :try_start_6
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :catchall_1
    move-exception v0

    .line 202
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 206
    .line 207
    .line 208
    throw v0
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0

    .line 209
    :goto_4
    :try_start_7
    new-instance v1, Le99;

    .line 210
    .line 211
    new-instance v5, Lx11;

    .line 212
    .line 213
    const/16 v6, 0x8

    .line 214
    .line 215
    invoke-direct {v5, v6, v4, v4}, Lx11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v1, v3, v5, v4}, Le99;-><init>(ILx11;Lk99;)V

    .line 219
    .line 220
    .line 221
    new-instance v3, Lzo2;

    .line 222
    .line 223
    const/16 v4, 0x11

    .line 224
    .line 225
    invoke-direct {v3, v4, p0, v1, v2}, Lzo2;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 226
    .line 227
    .line 228
    iget-object p0, p0, Lq89;->i:Landroid/os/Handler;

    .line 229
    .line 230
    invoke-virtual {p0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2

    .line 231
    .line 232
    .line 233
    goto :goto_5

    .line 234
    :catch_2
    const-string p0, "SignInClientImpl"

    .line 235
    .line 236
    const-string v1, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    .line 237
    .line 238
    invoke-static {p0, v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 239
    .line 240
    .line 241
    :goto_5
    return-void
.end method
