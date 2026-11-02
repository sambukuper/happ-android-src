.class public final synthetic Lmy7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lea6;

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Lgk;

.field public final synthetic f0:Lwk;

.field public final synthetic g0:Lqk;

.field public final synthetic h0:F

.field public final synthetic i0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lea6;Ljava/lang/Object;Lgk;Lwk;Lqk;FLgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmy7;->X:Lea6;

    .line 5
    .line 6
    iput-object p2, p0, Lmy7;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lmy7;->Z:Lgk;

    .line 9
    .line 10
    iput-object p4, p0, Lmy7;->f0:Lwk;

    .line 11
    .line 12
    iput-object p5, p0, Lmy7;->g0:Lqk;

    .line 13
    .line 14
    iput p6, p0, Lmy7;->h0:F

    .line 15
    .line 16
    iput-object p7, p0, Lmy7;->i0:Lgn2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    new-instance v0, Lok;

    .line 8
    .line 9
    iget-object p1, p0, Lmy7;->Z:Lgk;

    .line 10
    .line 11
    move-wide v4, v1

    .line 12
    invoke-interface {p1}, Lgk;->c()Lug8;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1}, Lgk;->g()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    new-instance v9, Lny7;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iget-object v10, p0, Lmy7;->g0:Lqk;

    .line 24
    .line 25
    invoke-direct {v9, v10, v1}, Lny7;-><init>(Lqk;B)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lmy7;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v3, p0, Lmy7;->f0:Lwk;

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    invoke-direct/range {v0 .. v9}, Lok;-><init>(Ljava/lang/Object;Lug8;Lwk;JLjava/lang/Object;JLdn2;)V

    .line 34
    .line 35
    .line 36
    iget v3, p0, Lmy7;->h0:F

    .line 37
    .line 38
    iget-object v6, p0, Lmy7;->i0:Lgn2;

    .line 39
    .line 40
    move-wide v1, v4

    .line 41
    move-object v5, v10

    .line 42
    move-object v4, p1

    .line 43
    invoke-static/range {v0 .. v6}, Lry7;->g(Lok;JFLgk;Lqk;Lgn2;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lmy7;->X:Lea6;

    .line 47
    .line 48
    iput-object v0, p0, Lea6;->X:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p0, Ldn8;->a:Ldn8;

    .line 51
    .line 52
    return-object p0
.end method
