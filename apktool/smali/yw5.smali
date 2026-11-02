.class public final synthetic Lyw5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:F

.field public final synthetic Y:Luu0;

.field public final synthetic Z:B


# direct methods
.method public synthetic constructor <init>(FILuu0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyw5;->X:F

    .line 5
    .line 6
    iput-object p3, p0, Lyw5;->Y:Luu0;

    .line 7
    .line 8
    iput-byte p2, p0, Lyw5;->Z:B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lf17;

    .line 2
    .line 3
    new-instance v0, Lqw5;

    .line 4
    .line 5
    iget v1, p0, Lyw5;->X:F

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lyw5;->Y:Luu0;

    .line 12
    .line 13
    invoke-static {v1, v2}, Lx97;->r(Ljava/lang/Comparable;Luu0;)Ljava/lang/Comparable;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-byte p0, p0, Lyw5;->Z:B

    .line 24
    .line 25
    invoke-direct {v0, v1, p0, v2}, Lqw5;-><init>(FILuu0;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ld17;->a:[Lnw3;

    .line 29
    .line 30
    sget-object p0, Lc17;->c:Le17;

    .line 31
    .line 32
    sget-object v1, Ld17;->a:[Lnw3;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, p0, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Ldn8;->a:Ldn8;

    .line 44
    .line 45
    return-object p0
.end method
