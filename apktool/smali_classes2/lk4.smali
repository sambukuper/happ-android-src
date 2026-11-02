.class public final Llk4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Lsu/happ/proxyutility/feature/main/MainActivity;

.field public final synthetic i0:Ljava/lang/String;

.field public final synthetic j0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public final synthetic k0:Z

.field public final synthetic l0:Z

.field public final synthetic m0:Ljava/lang/String;

.field public final synthetic n0:Z

.field public final synthetic o0:Z

.field public final synthetic p0:Lg83;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;ZZLg83;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llk4;->h0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 2
    .line 3
    iput-object p2, p0, Llk4;->i0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Llk4;->j0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 6
    .line 7
    iput-boolean p4, p0, Llk4;->k0:Z

    .line 8
    .line 9
    iput-boolean p5, p0, Llk4;->l0:Z

    .line 10
    .line 11
    iput-object p6, p0, Llk4;->m0:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Llk4;->n0:Z

    .line 14
    .line 15
    iput-boolean p8, p0, Llk4;->o0:Z

    .line 16
    .line 17
    iput-object p9, p0, Llk4;->p0:Lg83;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, Luy7;-><init>(ILq51;)V

    .line 21
    .line 22
    .line 23
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
    invoke-virtual {p0, p2, p1}, Llk4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Llk4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Llk4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 11

    .line 1
    new-instance v0, Llk4;

    .line 2
    .line 3
    iget-boolean v8, p0, Llk4;->o0:Z

    .line 4
    .line 5
    iget-object v9, p0, Llk4;->p0:Lg83;

    .line 6
    .line 7
    iget-object v1, p0, Llk4;->h0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 8
    .line 9
    iget-object v2, p0, Llk4;->i0:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Llk4;->j0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 12
    .line 13
    iget-boolean v4, p0, Llk4;->k0:Z

    .line 14
    .line 15
    iget-boolean v5, p0, Llk4;->l0:Z

    .line 16
    .line 17
    iget-object v6, p0, Llk4;->m0:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v7, p0, Llk4;->n0:Z

    .line 20
    .line 21
    move-object v10, p1

    .line 22
    invoke-direct/range {v0 .. v10}, Llk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;ZZLg83;Lq51;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-boolean v0, p0, Llk4;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    iput-boolean v1, p0, Llk4;->g0:Z

    .line 25
    .line 26
    iget-object v0, p0, Llk4;->h0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 27
    .line 28
    iget-object v1, p0, Llk4;->i0:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, p0, Llk4;->j0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 31
    .line 32
    iget-boolean v3, p0, Llk4;->k0:Z

    .line 33
    .line 34
    iget-boolean v4, p0, Llk4;->l0:Z

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    iget-object v6, p0, Llk4;->m0:Ljava/lang/String;

    .line 38
    .line 39
    iget-boolean v7, p0, Llk4;->n0:Z

    .line 40
    .line 41
    iget-boolean v8, p0, Llk4;->o0:Z

    .line 42
    .line 43
    iget-object v10, p0, Llk4;->p0:Lg83;

    .line 44
    .line 45
    const/16 v12, 0x10

    .line 46
    .line 47
    move-object v11, p0

    .line 48
    invoke-static/range {v0 .. v12}, Lsu/happ/proxyutility/feature/main/MainActivity;->P(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object p1, Lc71;->X:Lc71;

    .line 53
    .line 54
    if-ne p0, p1, :cond_2

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_2
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 58
    .line 59
    return-object p0
.end method
