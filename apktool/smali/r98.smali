.class public final Lr98;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Ls98;

.field public final synthetic i0:Lgn2;

.field public final synthetic j0:S


# direct methods
.method public constructor <init>(Ls98;Lgn2;JLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr98;->h0:Ls98;

    .line 2
    .line 3
    iput-object p2, p0, Lr98;->i0:Lgn2;

    .line 4
    .line 5
    long-to-int p1, p3

    .line 6
    iput-short p1, p0, Lr98;->j0:S

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p2, p1}, Lr98;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lr98;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lr98;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Lr98;

    .line 2
    .line 3
    iget-short p2, p0, Lr98;->j0:S

    .line 4
    .line 5
    int-to-long v3, p2

    .line 6
    iget-object v1, p0, Lr98;->h0:Ls98;

    .line 7
    .line 8
    iget-object v2, p0, Lr98;->i0:Lgn2;

    .line 9
    .line 10
    move-object v5, p1

    .line 11
    invoke-direct/range {v0 .. v5}, Lr98;-><init>(Ls98;Lgn2;JLq51;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lr98;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lr98;->h0:Ls98;

    .line 23
    .line 24
    iget-object v0, p1, Ls98;->f:Lu61;

    .line 25
    .line 26
    iget-object p1, p1, Ls98;->b:Lb71;

    .line 27
    .line 28
    new-instance v3, Lu68;

    .line 29
    .line 30
    iget-object v4, p0, Lr98;->i0:Lgn2;

    .line 31
    .line 32
    invoke-direct {v3, v4, v1, v2}, Lu68;-><init>(Lgn2;Lq51;B)V

    .line 33
    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    invoke-static {p1, v0, v3, v4}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-short v0, p0, Lr98;->j0:S

    .line 41
    .line 42
    int-to-long v3, v0

    .line 43
    new-instance v0, Lym7;

    .line 44
    .line 45
    const/4 v5, 0x6

    .line 46
    invoke-direct {v0, p1, v1, v5}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 47
    .line 48
    .line 49
    iput-boolean v2, p0, Lr98;->g0:Z

    .line 50
    .line 51
    invoke-static {v3, v4, v0, p0}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object p1, Lc71;->X:Lc71;

    .line 56
    .line 57
    if-ne p0, p1, :cond_2

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_2
    return-object p0
.end method
