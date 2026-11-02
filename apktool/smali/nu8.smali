.class public final Lnu8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lqe2;

.field public b:Lwk;

.field public c:Lwk;

.field public d:Lwk;

.field public final e:F


# direct methods
.method public constructor <init>(Lqe2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnu8;->a:Lqe2;

    .line 5
    .line 6
    invoke-interface {p1}, Lqe2;->z()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lnu8;->e:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(JLwk;Lwk;)Lwk;
    .locals 5

    .line 1
    iget-object v0, p0, Lnu8;->c:Lwk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p3}, Lwk;->c()Lwk;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lnu8;->c:Lwk;

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lwk;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget-object v2, p0, Lnu8;->c:Lwk;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const-string v4, "velocityVector"

    .line 20
    .line 21
    if-ge v1, v0, :cond_2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p4, v1}, Lwk;->a(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v4, p0, Lnu8;->a:Lqe2;

    .line 33
    .line 34
    invoke-interface {v4, v3, p1, p2}, Lqe2;->N(FJ)F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v2, v1, v3}, Lwk;->e(IF)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v3

    .line 48
    :cond_2
    if-eqz v2, :cond_3

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_3
    invoke-static {v4}, Ldh3;->T(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v3
.end method
