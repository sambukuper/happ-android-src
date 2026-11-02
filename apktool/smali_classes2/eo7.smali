.class public final Leo7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Lr77;

.field public final synthetic i0:Lky2;

.field public final synthetic j0:Landroid/content/Context;

.field public final synthetic k0:Lgn2;

.field public final synthetic l0:Lfn6;

.field public final synthetic m0:Lgn2;

.field public final synthetic n0:Lo87;

.field public final synthetic o0:Landroid/app/Activity;

.field public final synthetic p0:Lgn2;

.field public final synthetic q0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lr77;Lky2;Landroid/content/Context;Lgn2;Lfn6;Lgn2;Lo87;Landroid/app/Activity;Lgn2;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Leo7;->h0:Lr77;

    .line 2
    .line 3
    iput-object p2, p0, Leo7;->i0:Lky2;

    .line 4
    .line 5
    iput-object p3, p0, Leo7;->j0:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Leo7;->k0:Lgn2;

    .line 8
    .line 9
    iput-object p5, p0, Leo7;->l0:Lfn6;

    .line 10
    .line 11
    iput-object p6, p0, Leo7;->m0:Lgn2;

    .line 12
    .line 13
    iput-object p7, p0, Leo7;->n0:Lo87;

    .line 14
    .line 15
    iput-object p8, p0, Leo7;->o0:Landroid/app/Activity;

    .line 16
    .line 17
    iput-object p9, p0, Leo7;->p0:Lgn2;

    .line 18
    .line 19
    iput-object p10, p0, Leo7;->q0:Ljava/lang/String;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, Luy7;-><init>(ILq51;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Leo7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Leo7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Leo7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lc71;->X:Lc71;

    .line 17
    .line 18
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 12

    .line 1
    new-instance v0, Leo7;

    .line 2
    .line 3
    iget-object v9, p0, Leo7;->p0:Lgn2;

    .line 4
    .line 5
    iget-object v10, p0, Leo7;->q0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Leo7;->h0:Lr77;

    .line 8
    .line 9
    iget-object v2, p0, Leo7;->i0:Lky2;

    .line 10
    .line 11
    iget-object v3, p0, Leo7;->j0:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, p0, Leo7;->k0:Lgn2;

    .line 14
    .line 15
    iget-object v5, p0, Leo7;->l0:Lfn6;

    .line 16
    .line 17
    iget-object v6, p0, Leo7;->m0:Lgn2;

    .line 18
    .line 19
    iget-object v7, p0, Leo7;->n0:Lo87;

    .line 20
    .line 21
    iget-object v8, p0, Leo7;->o0:Landroid/app/Activity;

    .line 22
    .line 23
    move-object v11, p1

    .line 24
    invoke-direct/range {v0 .. v11}, Leo7;-><init>(Lr77;Lky2;Landroid/content/Context;Lgn2;Lfn6;Lgn2;Lo87;Landroid/app/Activity;Lgn2;Ljava/lang/String;Lq51;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-boolean v0, p0, Leo7;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ldo7;

    .line 23
    .line 24
    iget-object v12, p0, Leo7;->q0:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v13, 0x0

    .line 27
    iget-object v4, p0, Leo7;->i0:Lky2;

    .line 28
    .line 29
    iget-object v5, p0, Leo7;->j0:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v6, p0, Leo7;->k0:Lgn2;

    .line 32
    .line 33
    iget-object v7, p0, Leo7;->l0:Lfn6;

    .line 34
    .line 35
    iget-object v8, p0, Leo7;->m0:Lgn2;

    .line 36
    .line 37
    iget-object v9, p0, Leo7;->n0:Lo87;

    .line 38
    .line 39
    iget-object v10, p0, Leo7;->o0:Landroid/app/Activity;

    .line 40
    .line 41
    iget-object v11, p0, Leo7;->p0:Lgn2;

    .line 42
    .line 43
    invoke-direct/range {v3 .. v13}, Ldo7;-><init>(Lky2;Landroid/content/Context;Lgn2;Lfn6;Lgn2;Lo87;Landroid/app/Activity;Lgn2;Ljava/lang/String;Lq51;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Leo7;->h0:Lr77;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iput-boolean v2, p0, Leo7;->g0:Z

    .line 52
    .line 53
    invoke-static {p1, v3, p0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lc71;->X:Lc71;

    .line 58
    .line 59
    if-ne p0, p1, :cond_2

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_2
    :goto_0
    const-string p0, "SharedFlow never completes, this call should never return."

    .line 63
    .line 64
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v1
.end method
