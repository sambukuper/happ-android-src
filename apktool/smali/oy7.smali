.class public final synthetic Loy7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lea6;

.field public final synthetic Y:F

.field public final synthetic Z:Lgk;

.field public final synthetic f0:Lqk;

.field public final synthetic g0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lea6;FLgk;Lqk;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loy7;->X:Lea6;

    .line 5
    .line 6
    iput p2, p0, Loy7;->Y:F

    .line 7
    .line 8
    iput-object p3, p0, Loy7;->Z:Lgk;

    .line 9
    .line 10
    iput-object p4, p0, Loy7;->f0:Lqk;

    .line 11
    .line 12
    iput-object p5, p0, Loy7;->g0:Lgn2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    iget-object p1, p0, Loy7;->X:Lea6;

    .line 8
    .line 9
    iget-object p1, p1, Lea6;->X:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lok;

    .line 16
    .line 17
    iget v3, p0, Loy7;->Y:F

    .line 18
    .line 19
    iget-object v4, p0, Loy7;->Z:Lgk;

    .line 20
    .line 21
    iget-object v5, p0, Loy7;->f0:Lqk;

    .line 22
    .line 23
    iget-object v6, p0, Loy7;->g0:Lgn2;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lry7;->g(Lok;JFLgk;Lqk;Lgn2;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ldn8;->a:Ldn8;

    .line 29
    .line 30
    return-object p0
.end method
