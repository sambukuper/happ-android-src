.class public final Lpg1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lx67;


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lpg1;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JLz24;Lfi1;)Lmb6;
    .locals 2

    .line 1
    invoke-static {}, Lnf;->a()Llf;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide p2, p0, Lpg1;->a:J

    .line 6
    .line 7
    invoke-static {p2, p3}, Lnt1;->b(J)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-interface {p4, p0}, Lfi1;->h0(F)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p2, p3}, Lnt1;->a(J)F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-interface {p4, p2}, Lfi1;->h0(F)F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object p3, p1, Llf;->a:Landroid/graphics/Path;

    .line 24
    .line 25
    const/4 p4, 0x0

    .line 26
    invoke-virtual {p3, p4, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 27
    .line 28
    .line 29
    const/high16 v0, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float v1, p0, v0

    .line 32
    .line 33
    invoke-virtual {p1, v1, p4}, Llf;->e(FF)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p4, p2}, Llf;->e(FF)V

    .line 37
    .line 38
    .line 39
    neg-float p0, p0

    .line 40
    div-float/2addr p0, v0

    .line 41
    invoke-virtual {p1, p0, p4}, Llf;->e(FF)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 45
    .line 46
    .line 47
    new-instance p0, Lzd5;

    .line 48
    .line 49
    invoke-direct {p0, p1}, Lzd5;-><init>(Llf;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method
