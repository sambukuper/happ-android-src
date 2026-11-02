.class public final Lc89;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfa5;
.implements Lzc6;
.implements Lr51;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 63
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lc89;->X:Ljava/lang/Object;

    new-instance v0, Ljava/util/WeakHashMap;

    .line 64
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 65
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lc89;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "android.os.IMessenger"

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/os/Messenger;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lc89;->X:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object v2, p0, Lc89;->Y:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string v1, "com.google.android.gms.iid.IMessengerCompat"

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    new-instance v0, Lha9;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lha9;-><init>(Landroid/os/IBinder;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lc89;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v2, p0, Lc89;->X:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "Invalid interface descriptor: "

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    new-instance p0, Landroid/os/RemoteException;

    .line 55
    .line 56
    invoke-direct {p0}, Landroid/os/RemoteException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public synthetic constructor <init>(Landroid/os/Parcelable;Ljava/lang/Object;)V
    .locals 0

    .line 66
    iput-object p2, p0, Lc89;->X:Ljava/lang/Object;

    iput-object p1, p0, Lc89;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lc89;Lz18;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc89;->X:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc89;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg99;Landroid/app/AlertDialog;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p2, p0, Lc89;->X:Ljava/lang/Object;

    iput-object p1, p0, Lc89;->Y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ZLcom/google/android/gms/common/api/Status;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc89;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    iget-object p0, p0, Lc89;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/util/Map;

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/util/Map$Entry;

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/util/Map$Entry;

    .line 88
    .line 89
    if-nez p1, :cond_3

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lz18;

    .line 108
    .line 109
    new-instance v1, Lpn;

    .line 110
    .line 111
    invoke-direct {v1, p2}, Lpn;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lz18;->b(Ljava/lang/Exception;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    return-void

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    throw p1

    .line 122
    :catchall_1
    move-exception p0

    .line 123
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 124
    throw p0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc89;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh99;

    .line 4
    .line 5
    check-cast p2, Lz18;

    .line 6
    .line 7
    check-cast p1, Lfa9;

    .line 8
    .line 9
    new-instance v1, Lms4;

    .line 10
    .line 11
    invoke-direct {v1, v0, p2}, Lms4;-><init>(Lh99;Lz18;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, v0, Lms2;->a:Landroid/content/Context;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :try_start_0
    invoke-static {p2}, Ln59;->a(Landroid/content/Context;)Lbz1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object v2, v2, Lbz1;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget p2, p2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move p2, v0

    .line 39
    :goto_0
    iget-object p0, p0, Lc89;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Loc6;

    .line 42
    .line 43
    iput p2, p0, Loc6;->h0:I

    .line 44
    .line 45
    invoke-virtual {p1}, Lu10;->h()Landroid/os/IInterface;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lja9;

    .line 50
    .line 51
    new-instance p2, Lzx0;

    .line 52
    .line 53
    const/4 v2, -0x1

    .line 54
    const/4 v3, 0x1

    .line 55
    invoke-direct {p2, v2, v2, v0, v3}, Lzx0;-><init>(IIIZ)V

    .line 56
    .line 57
    .line 58
    sget-object v2, Lso;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 59
    .line 60
    new-instance v2, Lso;

    .line 61
    .line 62
    invoke-direct {v2, p2, v0}, Lso;-><init>(Lzx0;Z)V

    .line 63
    .line 64
    .line 65
    iput-boolean v0, v2, Lso;->Z:Z

    .line 66
    .line 67
    iget-boolean p2, v2, Lso;->Z:Z

    .line 68
    .line 69
    new-instance v4, Lso;

    .line 70
    .line 71
    iget-object v2, v2, Lso;->X:Lzx0;

    .line 72
    .line 73
    invoke-direct {v4, v2, v3}, Lso;-><init>(Lzx0;Z)V

    .line 74
    .line 75
    .line 76
    iput-boolean p2, v4, Lso;->Z:Z

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const-string v2, "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService"

    .line 83
    .line 84
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sget v2, Laa9;->a:I

    .line 88
    .line 89
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p2, v0}, Loc6;->writeToParcel(Landroid/os/Parcel;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, p2, v0}, Lso;->writeToParcel(Landroid/os/Parcel;I)V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :try_start_1
    iget-object p1, p1, Lja9;->g:Landroid/os/IBinder;

    .line 109
    .line 110
    invoke-interface {p1, v3, p2, p0, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :catchall_0
    move-exception p1

    .line 124
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 128
    .line 129
    .line 130
    throw p1
.end method

.method public g(Lfb9;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc89;->X:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyq6;

    .line 4
    .line 5
    iget-object p0, p0, Lc89;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p1}, Lfb9;->i()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lfb9;->g()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const-string v2, "google.messenger"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lyq6;->b(Landroid/os/Bundle;)Lfb9;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Ldp1;->f0:Ldp1;

    .line 37
    .line 38
    new-instance v0, Lfb9;

    .line 39
    .line 40
    invoke-direct {v0}, Lfb9;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lna9;

    .line 44
    .line 45
    sget-object v2, Ls18;->Y:Ls18;

    .line 46
    .line 47
    invoke-direct {v1, p1, v2, v0}, Lna9;-><init>(Ljava/util/concurrent/Executor;Liw7;Lfb9;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lfb9;->b:Lo8;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Lo8;->r(Lza9;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lfb9;->n()V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    return-object p1
.end method

.method public i(Lfb9;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc89;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lc89;

    .line 4
    .line 5
    iget-object p1, p1, Lc89;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ljava/util/Map;

    .line 8
    .line 9
    iget-object p0, p0, Lc89;->X:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lz18;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
