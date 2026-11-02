.class public final Lt24;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvc6;
.implements Lv61;


# instance fields
.field public final X:Ls61;

.field public final Y:Lrn2;

.field public final Z:Lm51;

.field public f0:Log7;


# direct methods
.method public constructor <init>(Ls61;Lrn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt24;->X:Ls61;

    .line 5
    .line 6
    iput-object p2, p0, Lt24;->Y:Lrn2;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Ls61;->B0(Ls61;)Ls61;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lgv3;->c(Ls61;)Lm51;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lt24;->Z:Lm51;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B0(Ls61;)Ls61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final H0(Lr61;)Lq61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->t(Lq61;Lr61;)Lq61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final J(Ls61;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lp01;->Y:Lbe;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp01;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lp5;

    .line 12
    .line 13
    const/16 v2, 0x12

    .line 14
    .line 15
    invoke-direct {v1, v0, p0, v2}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2, v1}, Los4;->U(Ljava/lang/Throwable;Ldn2;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lt24;->X:Ls61;

    .line 22
    .line 23
    sget-object v0, Loy1;->p0:Loy1;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lv61;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, p1, p2}, Lv61;->J(Ls61;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    throw p2
.end method

.method public final U(Lrn2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt24;->f0:Log7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La84;

    .line 6
    .line 7
    invoke-direct {v1}, La84;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lrm3;->l(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lt24;->f0:Log7;

    .line 15
    .line 16
    return-void
.end method

.method public final a0(Lr61;)Ls61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->I(Lq61;Lr61;)Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt24;->f0:Log7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La84;

    .line 6
    .line 7
    invoke-direct {v1}, La84;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lrm3;->l(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lt24;->f0:Log7;

    .line 15
    .line 16
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt24;->f0:Log7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    const-string v3, "Old job was still running!"

    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lt24;->Y:Lrn2;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    iget-object v3, p0, Lt24;->Z:Lm51;

    .line 23
    .line 24
    invoke-static {v3, v1, v1, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lt24;->f0:Log7;

    .line 29
    .line 30
    return-void
.end method

.method public final getKey()Lr61;
    .locals 0

    .line 1
    sget-object p0, Loy1;->p0:Loy1;

    .line 2
    .line 3
    return-object p0
.end method
