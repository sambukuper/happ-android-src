.class public abstract Ljx4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lnh1;


# instance fields
.field public X:Ljx4;

.field public Y:Lm51;

.field public Z:I

.field public f0:I

.field public g0:Ljx4;

.field public h0:Ljx4;

.field public i0:Lx85;

.field public j0:Li55;

.field public k0:Z

.field public l0:Z

.field public m0:Z

.field public n0:Z

.field public o0:Lp5;

.field public p0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Ljx4;->X:Ljx4;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Ljx4;->f0:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final M0()Lb71;
    .locals 3

    .line 1
    iget-object v0, p0, Ljx4;->Y:Lm51;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lmf5;->getCoroutineContext()Ls61;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lmf5;->getCoroutineContext()Ls61;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Loy1;->E0:Loy1;

    .line 22
    .line 23
    invoke-interface {v1, v2}, Ls61;->H0(Lr61;)Lq61;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lbm3;

    .line 28
    .line 29
    new-instance v2, Ldm3;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ldm3;-><init>(Lbm3;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2}, Ls61;->B0(Ls61;)Ls61;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ljx4;->Y:Lm51;

    .line 43
    .line 44
    :cond_0
    return-object v0
.end method

.method public N0()Z
    .locals 0

    .line 1
    instance-of p0, p0, Ly00;

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public O0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node attached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ljx4;->j0:Li55;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "attach invoked on a node without a coordinator"

    .line 16
    .line 17
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Ljx4;->p0:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Ljx4;->m0:Z

    .line 24
    .line 25
    return-void
.end method

.method public P0()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot detach a node that is not attached"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Ljx4;->m0:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    .line 15
    .line 16
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-boolean v0, p0, Ljx4;->n0:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    .line 24
    .line 25
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Ljx4;->p0:Z

    .line 30
    .line 31
    iget-object v0, p0, Ljx4;->Y:Lm51;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    new-instance v1, Lpx4;

    .line 36
    .line 37
    const-string v2, "The Modifier.Node was detached"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Ljx4;->Y:Lm51;

    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public Q0()V
    .locals 0

    .line 1
    return-void
.end method

.method public R0()V
    .locals 0

    .line 1
    return-void
.end method

.method public S0()V
    .locals 0

    .line 1
    return-void
.end method

.method public T0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "reset() called on an unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljx4;->S0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public U0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Ljx4;->m0:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    .line 15
    .line 16
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Ljx4;->m0:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Ljx4;->Q0()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Ljx4;->n0:Z

    .line 27
    .line 28
    return-void
.end method

.method public V0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node detached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ljx4;->j0:Li55;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "detach invoked on a node without a coordinator"

    .line 16
    .line 17
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-boolean v0, p0, Ljx4;->n0:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    .line 25
    .line 26
    invoke-static {v0}, Lwc3;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Ljx4;->n0:Z

    .line 31
    .line 32
    iget-object v0, p0, Ljx4;->o0:Lp5;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Lp5;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-virtual {p0}, Ljx4;->R0()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public W0(Ljx4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljx4;->X:Ljx4;

    .line 2
    .line 3
    return-void
.end method

.method public X0(Li55;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljx4;->j0:Li55;

    .line 2
    .line 3
    return-void
.end method
