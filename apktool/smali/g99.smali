.class public final Lg99;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld89;Lb8;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lg99;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lg99;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p2, p0, Lg99;->X:B

    iput-object p1, p0, Lg99;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, Lg99;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lg99;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lna9;

    .line 9
    .line 10
    iget-object v0, p0, Lna9;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object p0, p0, Lna9;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lba5;

    .line 16
    .line 17
    invoke-interface {p0}, Lba5;->c()V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0

    .line 25
    :pswitch_0
    new-instance v0, Ljava/io/IOException;

    .line 26
    .line 27
    const-string v1, "TIMEOUT"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lg99;->Y:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lz18;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lz18;->b(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object p0, p0, Lg99;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lxz8;

    .line 43
    .line 44
    iget-object v0, p0, Lxz8;->a:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_1
    invoke-virtual {p0}, Lxz8;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    goto :goto_0

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iget-object v1, p0, Lxz8;->j:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, " ** IS FORCE-RELEASED ON TIMEOUT **"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lxz8;->d()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lxz8;->b()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_1

    .line 76
    .line 77
    monitor-exit v0

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/4 v1, 0x1

    .line 80
    iput v1, p0, Lxz8;->c:I

    .line 81
    .line 82
    invoke-virtual {p0}, Lxz8;->e()V

    .line 83
    .line 84
    .line 85
    monitor-exit v0

    .line 86
    :goto_0
    return-void

    .line 87
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 88
    throw p0

    .line 89
    :pswitch_2
    const/4 p0, 0x0

    .line 90
    throw p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
