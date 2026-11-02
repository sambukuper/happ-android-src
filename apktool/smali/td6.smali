.class public final Ltd6;
.super Landroid/os/Binder;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp43;


# static fields
.field public static final synthetic h:I

.field public static final i:[B


# instance fields
.field public final g:Lx39;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Ltd6;->i:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroidx/work/multiprocess/RemoteWorkManagerService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lp43;->e:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ltd6;->g:Lx39;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lr43;)V
    .locals 5

    .line 1
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx39;->l0:Ly5;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lx39;->j0:Lxy0;

    .line 12
    .line 13
    iget-object v1, v1, Lxy0;->j0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lra;

    .line 16
    .line 17
    const-string v2, "CancelWorkByName_"

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, v0, Ly5;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lh37;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v4, Lhm0;

    .line 31
    .line 32
    invoke-direct {v4, p1, p0}, Lhm0;-><init>(Ljava/lang/String;Lx39;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2, v3, v4}, Los4;->u(Lra;Ljava/lang/String;Ljava/util/concurrent/Executor;Ldn2;)Lwl6;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, v0, Ly5;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lh37;

    .line 42
    .line 43
    new-instance v0, Lsd6;

    .line 44
    .line 45
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lud0;

    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    invoke-direct {v0, p1, p2, p0, v1}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lwb4;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {p2, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final j(Lr43;[B)V
    .locals 5

    .line 1
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lhh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 4
    .line 5
    invoke-static {p2, v0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lhh5;

    .line 10
    .line 11
    iget-object v0, p0, Lx39;->l0:Ly5;

    .line 12
    .line 13
    iget-object v1, v0, Ly5;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lh37;

    .line 16
    .line 17
    new-instance v2, Lr39;

    .line 18
    .line 19
    iget-object v3, p0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 20
    .line 21
    iget-object v4, p0, Lx39;->n0:Lfv5;

    .line 22
    .line 23
    invoke-direct {v2, v3, v4, v0}, Lr39;-><init>(Landroidx/work/impl/WorkDatabase;Lfv5;Ly5;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lx39;->i0:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v0, p2, Lhh5;->X:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object p2, p2, Lhh5;->Y:Lkj2;

    .line 35
    .line 36
    invoke-virtual {v2, p0, v0, p2}, Lr39;->c(Landroid/content/Context;Ljava/util/UUID;Lkj2;)Lxb4;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p2, Lsd6;

    .line 41
    .line 42
    const/16 v0, 0x9

    .line 43
    .line 44
    invoke-direct {p2, v1, p1, p0, v0}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lwb4;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    invoke-static {p1, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final k(Ljava/lang/String;[BLr43;)V
    .locals 6

    .line 1
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lyh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 4
    .line 5
    invoke-static {p2, v0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lyh5;

    .line 10
    .line 11
    iget-object p2, p2, Lyh5;->X:Lg49;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lx39;->l0:Ly5;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lx39;->j0:Lxy0;

    .line 25
    .line 26
    iget-object v1, v1, Lxy0;->j0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lra;

    .line 29
    .line 30
    const-string v2, "enqueueUniquePeriodic_"

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, v0, Ly5;->Y:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lh37;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v4, Lg00;

    .line 44
    .line 45
    const/16 v5, 0x16

    .line 46
    .line 47
    invoke-direct {v4, p0, p1, p2, v5}, Lg00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2, v3, v4}, Los4;->u(Lra;Ljava/lang/String;Ljava/util/concurrent/Executor;Ldn2;)Lwl6;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iget-object p1, v0, Ly5;->Y:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lh37;

    .line 57
    .line 58
    new-instance p2, Lsd6;

    .line 59
    .line 60
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Lud0;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-direct {p2, p1, p3, p0, v0}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lwb4;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    invoke-static {p3, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final m(Lr43;[B)V
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Luh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Luh5;

    .line 8
    .line 9
    iget-object v1, p0, Ltd6;->g:Lx39;

    .line 10
    .line 11
    iget-object p2, p2, Luh5;->X:Lth5;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Ll39;

    .line 17
    .line 18
    iget-object v2, p2, Lth5;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p2, Lth5;->b:Lg62;

    .line 21
    .line 22
    iget-object v4, p2, Lth5;->c:Ljava/util/List;

    .line 23
    .line 24
    iget-object p2, p2, Lth5;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v1, p2}, Lth5;->a(Lx39;Ljava/util/List;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-direct/range {v0 .. v5}, Ll39;-><init>(Lx39;Ljava/lang/String;Lg62;Ljava/util/List;Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ll39;->a()Lwl6;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 38
    .line 39
    iget-object p0, p0, Lx39;->l0:Ly5;

    .line 40
    .line 41
    iget-object p0, p0, Ly5;->Y:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lh37;

    .line 44
    .line 45
    new-instance v0, Lsd6;

    .line 46
    .line 47
    iget-object p2, p2, Lwl6;->Y:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Lud0;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v0, p0, p1, p2, v1}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lwb4;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p0, v0

    .line 61
    invoke-static {p1, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 9

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    sget-object v1, Lp43;->e:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-lt p1, v2, :cond_0

    .line 8
    .line 9
    if-gt p1, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v3, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    if-ne p1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    packed-switch p1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p0, p2, p1}, Ltd6;->j(Lr43;[B)V

    .line 53
    .line 54
    .line 55
    return v2

    .line 56
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    :try_start_0
    sget-object p3, Lsh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 69
    .line 70
    invoke-static {p1, p3}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lsh5;

    .line 75
    .line 76
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 77
    .line 78
    iget-object p3, p0, Lx39;->i0:Landroid/content/Context;

    .line 79
    .line 80
    iget-object p3, p0, Lx39;->l0:Ly5;

    .line 81
    .line 82
    iget-object p4, p3, Ly5;->Y:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p4, Lh37;

    .line 85
    .line 86
    iget-object p0, p0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 87
    .line 88
    new-instance v0, Le49;

    .line 89
    .line 90
    invoke-direct {v0, p0, p3}, Le49;-><init>(Landroidx/work/impl/WorkDatabase;Ly5;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p1, Lsh5;->X:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-object p1, p1, Lsh5;->Y:Lfh5;

    .line 100
    .line 101
    iget-object p1, p1, Lfh5;->X:Lu91;

    .line 102
    .line 103
    iget-object p3, p3, Ly5;->Y:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p3, Lh37;

    .line 106
    .line 107
    const-string v1, "updateProgress"

    .line 108
    .line 109
    new-instance v3, Lg00;

    .line 110
    .line 111
    const/16 v4, 0x15

    .line 112
    .line 113
    invoke-direct {v3, v0, p0, p1, v4}, Lg00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {p3, v1, v3}, Lvr3;->u(Ljava/util/concurrent/Executor;Ljava/lang/String;Ldn2;)Lud0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, Lsd6;

    .line 121
    .line 122
    const/16 p3, 0x8

    .line 123
    .line 124
    invoke-direct {p1, p4, p2, p0, p3}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lwb4;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :catchall_0
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    invoke-static {p2, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_1

    .line 138
    .line 139
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    :try_start_1
    sget-object p3, Lxh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 152
    .line 153
    invoke-static {p1, p3}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Lxh5;

    .line 158
    .line 159
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 160
    .line 161
    iget-object p3, p0, Lx39;->l0:Ly5;

    .line 162
    .line 163
    iget-object p4, p3, Ly5;->Y:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p4, Lh37;

    .line 166
    .line 167
    iget-object p1, p1, Lxh5;->X:Lyr6;

    .line 168
    .line 169
    iget-object p0, p0, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    new-instance v0, Lt16;

    .line 175
    .line 176
    const/16 v1, 0x16

    .line 177
    .line 178
    invoke-direct {v0, p1, v1}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    iget-object p1, p3, Ly5;->Y:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, Lh37;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    const-string p3, "loadStatusFuture"

    .line 189
    .line 190
    new-instance v3, La23;

    .line 191
    .line 192
    invoke-direct {v3, v0, p0, v1}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {p1, p3, v3}, Lvr3;->u(Ljava/util/concurrent/Executor;Ljava/lang/String;Ldn2;)Lud0;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    new-instance p1, Lsd6;

    .line 200
    .line 201
    const/4 p3, 0x7

    .line 202
    invoke-direct {p1, p4, p2, p0, p3}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Lwb4;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :catchall_1
    move-exception v0

    .line 211
    move-object p0, v0

    .line 212
    invoke-static {p2, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {p1}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 226
    .line 227
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget-object p2, p0, Lx39;->l0:Ly5;

    .line 231
    .line 232
    iget-object p3, p0, Lx39;->j0:Lxy0;

    .line 233
    .line 234
    iget-object p3, p3, Lxy0;->j0:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p3, Lra;

    .line 237
    .line 238
    const-string p4, "CancelAllWork"

    .line 239
    .line 240
    iget-object v0, p2, Ly5;->Y:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Lh37;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v1, Lim0;

    .line 248
    .line 249
    const/4 v3, 0x0

    .line 250
    invoke-direct {v1, p0, v3}, Lim0;-><init>(Lx39;B)V

    .line 251
    .line 252
    .line 253
    invoke-static {p3, p4, v0, v1}, Los4;->u(Lra;Ljava/lang/String;Ljava/util/concurrent/Executor;Ldn2;)Lwl6;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    iget-object p2, p2, Ly5;->Y:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p2, Lh37;

    .line 260
    .line 261
    new-instance p3, Lsd6;

    .line 262
    .line 263
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast p0, Lud0;

    .line 266
    .line 267
    const/4 p4, 0x6

    .line 268
    invoke-direct {p3, p2, p1, p0, p4}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p3}, Lwb4;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :catchall_2
    move-exception v0

    .line 277
    move-object p0, v0

    .line 278
    invoke-static {p1, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_1

    .line 282
    .line 283
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    invoke-virtual {p0, p1, p2}, Ltd6;->a(Ljava/lang/String;Lr43;)V

    .line 296
    .line 297
    .line 298
    return v2

    .line 299
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 312
    .line 313
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object p3, p0, Lx39;->l0:Ly5;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget-object p4, p0, Lx39;->j0:Lxy0;

    .line 322
    .line 323
    iget-object p4, p4, Lxy0;->j0:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p4, Lra;

    .line 326
    .line 327
    const-string v0, "CancelWorkByTag_"

    .line 328
    .line 329
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    iget-object v1, p3, Ly5;->Y:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v1, Lh37;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v3, Lhm0;

    .line 341
    .line 342
    invoke-direct {v3, p0, p1}, Lhm0;-><init>(Lx39;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-static {p4, v0, v1, v3}, Los4;->u(Lra;Ljava/lang/String;Ljava/util/concurrent/Executor;Ldn2;)Lwl6;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    iget-object p1, p3, Ly5;->Y:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast p1, Lh37;

    .line 352
    .line 353
    new-instance p3, Lsd6;

    .line 354
    .line 355
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast p0, Lud0;

    .line 358
    .line 359
    const/4 p4, 0x4

    .line 360
    invoke-direct {p3, p1, p2, p0, p4}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p3}, Lwb4;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 364
    .line 365
    .line 366
    goto/16 :goto_1

    .line 367
    .line 368
    :catchall_3
    move-exception v0

    .line 369
    move-object p0, v0

    .line 370
    invoke-static {p2, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 380
    .line 381
    .line 382
    move-result-object p2

    .line 383
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 384
    .line 385
    .line 386
    move-result-object p2

    .line 387
    iget-object p0, p0, Ltd6;->g:Lx39;

    .line 388
    .line 389
    :try_start_4
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    iget-object p3, p0, Lx39;->l0:Ly5;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object p4, p0, Lx39;->j0:Lxy0;

    .line 402
    .line 403
    iget-object p4, p4, Lxy0;->j0:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast p4, Lra;

    .line 406
    .line 407
    const-string v0, "CancelWorkById"

    .line 408
    .line 409
    iget-object v1, p3, Ly5;->Y:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v1, Lh37;

    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    new-instance v3, Lp5;

    .line 417
    .line 418
    const/16 v4, 0x10

    .line 419
    .line 420
    invoke-direct {v3, p0, p1, v4}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 421
    .line 422
    .line 423
    invoke-static {p4, v0, v1, v3}, Los4;->u(Lra;Ljava/lang/String;Ljava/util/concurrent/Executor;Ldn2;)Lwl6;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    iget-object p1, p3, Ly5;->Y:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast p1, Lh37;

    .line 430
    .line 431
    new-instance p3, Lsd6;

    .line 432
    .line 433
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast p0, Lud0;

    .line 436
    .line 437
    const/4 p4, 0x3

    .line 438
    invoke-direct {p3, p1, p2, p0, p4}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {p3}, Lwb4;->d()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 442
    .line 443
    .line 444
    goto/16 :goto_1

    .line 445
    .line 446
    :catchall_4
    move-exception v0

    .line 447
    move-object p0, v0

    .line 448
    invoke-static {p2, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 449
    .line 450
    .line 451
    goto :goto_1

    .line 452
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 457
    .line 458
    .line 459
    move-result-object p2

    .line 460
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 461
    .line 462
    .line 463
    move-result-object p2

    .line 464
    invoke-virtual {p0, p2, p1}, Ltd6;->m(Lr43;[B)V

    .line 465
    .line 466
    .line 467
    return v2

    .line 468
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 473
    .line 474
    .line 475
    move-result-object p3

    .line 476
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 477
    .line 478
    .line 479
    move-result-object p2

    .line 480
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 481
    .line 482
    .line 483
    move-result-object p2

    .line 484
    invoke-virtual {p0, p1, p3, p2}, Ltd6;->k(Ljava/lang/String;[BLr43;)V

    .line 485
    .line 486
    .line 487
    return v2

    .line 488
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    invoke-static {p2}, Led6;->b(Landroid/os/IBinder;)Lr43;

    .line 497
    .line 498
    .line 499
    move-result-object p2

    .line 500
    iget-object v4, p0, Ltd6;->g:Lx39;

    .line 501
    .line 502
    :try_start_5
    sget-object p0, Lzh5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 503
    .line 504
    invoke-static {p1, p0}, Lw79;->O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p0

    .line 508
    check-cast p0, Lzh5;

    .line 509
    .line 510
    iget-object v7, p0, Lzh5;->X:Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 516
    .line 517
    .line 518
    move-result p0

    .line 519
    if-nez p0, :cond_3

    .line 520
    .line 521
    new-instance v3, Ll39;

    .line 522
    .line 523
    sget-object v6, Lg62;->Y:Lg62;

    .line 524
    .line 525
    const/4 v8, 0x0

    .line 526
    const/4 v5, 0x0

    .line 527
    invoke-direct/range {v3 .. v8}, Ll39;-><init>(Lx39;Ljava/lang/String;Lg62;Ljava/util/List;Ljava/util/List;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3}, Ll39;->a()Lwl6;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    iget-object p1, v4, Lx39;->l0:Ly5;

    .line 535
    .line 536
    iget-object p1, p1, Ly5;->Y:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast p1, Lh37;

    .line 539
    .line 540
    new-instance p3, Lsd6;

    .line 541
    .line 542
    iget-object p0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast p0, Lud0;

    .line 545
    .line 546
    invoke-direct {p3, p1, p2, p0, v2}, Lsd6;-><init>(Ljava/util/concurrent/Executor;Lr43;Lxb4;B)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {p3}, Lwb4;->d()V

    .line 550
    .line 551
    .line 552
    goto :goto_1

    .line 553
    :catchall_5
    move-exception v0

    .line 554
    move-object p0, v0

    .line 555
    goto :goto_0

    .line 556
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 557
    .line 558
    const-string p1, "enqueue needs at least one WorkRequest."

    .line 559
    .line 560
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 564
    :goto_0
    invoke-static {p2, p0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V

    .line 565
    .line 566
    .line 567
    :goto_1
    return v2

    .line 568
    nop

    .line 569
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
