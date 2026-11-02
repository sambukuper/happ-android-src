.class public final Lw38;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Lh38;


# instance fields
.field public s0:Lub8;

.field public final t0:Ll48;

.field public final u0:Lli;

.field public final v0:Lpy7;

.field public w0:Log7;

.field public final x0:Lzi1;

.field public y0:Ls86;


# direct methods
.method public constructor <init>(Lub8;Ll48;Lli;Lpy7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw38;->s0:Lub8;

    .line 5
    .line 6
    iput-object p2, p0, Lw38;->t0:Ll48;

    .line 7
    .line 8
    iput-object p3, p0, Lw38;->u0:Lli;

    .line 9
    .line 10
    iput-object p4, p0, Lw38;->v0:Lpy7;

    .line 11
    .line 12
    new-instance p1, Lv38;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Lv38;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lrd7;->b(Ldn2;)Lzi1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lw38;->x0:Lzi1;

    .line 23
    .line 24
    sget-object p1, Ls86;->e:Ls86;

    .line 25
    .line 26
    iput-object p1, p0, Lw38;->y0:Ls86;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final Q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw38;->s0:Lub8;

    .line 2
    .line 3
    sget-object v1, Ltb8;->Z:Ltb8;

    .line 4
    .line 5
    iput-object v1, v0, Lub8;->b:Ltb8;

    .line 6
    .line 7
    iput-object p0, v0, Lub8;->a:Lw38;

    .line 8
    .line 9
    return-void
.end method

.method public final R0()V
    .locals 1

    .line 1
    iget-object p0, p0, Lw38;->s0:Lub8;

    .line 2
    .line 3
    sget-object v0, Ltb8;->Y:Ltb8;

    .line 4
    .line 5
    iput-object v0, p0, Lub8;->b:Ltb8;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lub8;->a:Lw38;

    .line 9
    .line 10
    return-void
.end method

.method public final S()Lg38;
    .locals 0

    .line 1
    iget-object p0, p0, Lw38;->x0:Lzi1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lg38;

    .line 8
    .line 9
    return-object p0
.end method

.method public final j(Ly24;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw38;->m(Ly24;)Ls86;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ls86;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public final m(Ly24;)Ls86;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lw38;->y0:Ls86;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lw38;->v0:Lpy7;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lpy7;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ls86;

    .line 15
    .line 16
    iput-object p1, p0, Lw38;->y0:Ls86;

    .line 17
    .line 18
    return-object p1
.end method
