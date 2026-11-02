.class public final synthetic Lep7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Ljava/lang/String;

.field public final synthetic Z:Z

.field public final synthetic f0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

.field public final synthetic g0:Lj2;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLsu/happ/proxyutility/domain/routing/entity/SubRoutingState;Lj2;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lep7;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lep7;->Y:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lep7;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lep7;->f0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 11
    .line 12
    iput-object p5, p0, Lep7;->g0:Lj2;

    .line 13
    .line 14
    iput-object p6, p0, Lep7;->h0:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p7, p0, Lep7;->i0:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lqn7;

    .line 6
    .line 7
    iget-object v2, v0, Lep7;->f0:Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-ne v5, v4, :cond_0

    .line 18
    .line 19
    move v5, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v5, v3

    .line 22
    :goto_0
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/SubRoutingState;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ne v2, v4, :cond_1

    .line 29
    .line 30
    move v6, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v6, v3

    .line 33
    :goto_1
    const/4 v15, 0x0

    .line 34
    const/16 v16, 0x7e00

    .line 35
    .line 36
    iget-object v2, v0, Lep7;->X:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, v0, Lep7;->Y:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean v4, v0, Lep7;->Z:Z

    .line 41
    .line 42
    iget-object v7, v0, Lep7;->g0:Lj2;

    .line 43
    .line 44
    iget-object v8, v0, Lep7;->h0:Ljava/lang/String;

    .line 45
    .line 46
    iget-boolean v9, v0, Lep7;->i0:Z

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, 0x0

    .line 51
    const/4 v13, 0x0

    .line 52
    const/4 v14, 0x0

    .line 53
    invoke-static/range {v1 .. v16}, Lqn7;->a(Lqn7;Ljava/lang/String;Ljava/lang/String;ZZZLb83;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLaw5;I)Lqn7;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method
