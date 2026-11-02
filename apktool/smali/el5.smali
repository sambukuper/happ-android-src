.class public final Lel5;
.super Lxc8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lh80;

.field public final c:Lcv5;


# direct methods
.method public constructor <init>(Lo02;Lh80;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lel5;->b:Lh80;

    .line 5
    .line 6
    iget-boolean p2, p1, Lo02;->Y:Z

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget-object p1, Lo02;->f0:Lcv5;

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v1, 0x1c

    .line 20
    .line 21
    if-lt v0, v1, :cond_1

    .line 22
    .line 23
    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string v0, "Process pid("

    .line 29
    .line 30
    const-string v1, ")"

    .line 31
    .line 32
    invoke-static {v0, p2, v1}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    iget-object v1, p1, Lo02;->X:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v1

    .line 39
    :try_start_0
    iget-boolean v2, p1, Lo02;->Y:Z

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    new-instance v2, Lcv5;

    .line 44
    .line 45
    invoke-direct {v2, p1, p2, v0}, Lcv5;-><init>(Lo02;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sput-object v2, Lo02;->f0:Lcv5;

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    iput-boolean p2, p1, Lo02;->Y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    :goto_1
    monitor-exit v1

    .line 57
    sget-object p1, Lo02;->f0:Lcv5;

    .line 58
    .line 59
    :goto_2
    iput-object p1, p0, Lel5;->c:Lcv5;

    .line 60
    .line 61
    return-void

    .line 62
    :goto_3
    monitor-exit v1

    .line 63
    throw p0
.end method
