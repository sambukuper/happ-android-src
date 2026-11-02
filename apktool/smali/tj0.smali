.class public abstract Ltj0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lqv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lnr4;->f(I)Lqv;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Ltj0;->a:Lqv;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Lnj0;)Lrj0;
    .locals 2

    .line 1
    const-string v0, "CameraPipe"

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwl6;

    .line 7
    .line 8
    const/16 v1, 0x10

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Lwl6;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lb8;

    .line 14
    .line 15
    iget-object p0, p0, Lnj0;->b:Lpj0;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lb8;-><init>(Lpj0;)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lr91;

    .line 21
    .line 22
    invoke-direct {p0, v0, v1}, Lr91;-><init>(Lwl6;Lb8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lrj0;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lrj0;-><init>(Lr91;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    throw p0
.end method
