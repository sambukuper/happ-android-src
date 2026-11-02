.class public final Lxm2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lax7;


# instance fields
.field public final X:Landroid/content/Context;

.field public final Y:Ljava/lang/String;

.field public final Z:Lb8;

.field public final f0:Z

.field public final g0:Z

.field public final h0:Lvz7;

.field public i0:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lb8;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxm2;->X:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lxm2;->Y:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lxm2;->Z:Lb8;

    .line 12
    .line 13
    iput-boolean p4, p0, Lxm2;->f0:Z

    .line 14
    .line 15
    iput-boolean p5, p0, Lxm2;->g0:Z

    .line 16
    .line 17
    new-instance p1, Ltb2;

    .line 18
    .line 19
    const/4 p2, 0x2

    .line 20
    invoke-direct {p1, p0, p2}, Ltb2;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lvz7;

    .line 24
    .line 25
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lxm2;->h0:Lvz7;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object p0, p0, Lxm2;->h0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lwm2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lwm2;->close()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final g0()Lsm2;
    .locals 1

    .line 1
    iget-object p0, p0, Lxm2;->h0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwm2;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Lwm2;->g(Z)Lsm2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxm2;->Y:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxm2;->h0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lwm2;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-boolean p1, p0, Lxm2;->i0:Z

    .line 19
    .line 20
    return-void
.end method
