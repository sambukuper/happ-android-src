.class public Ln54;
.super Lo54;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llw3;


# instance fields
.field public final Y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldn2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lo54;-><init>(Ldn2;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ln54;->Y:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo54;->f()Lnw3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Llw3;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final bridge synthetic b()Lhw3;
    .locals 0

    .line 12
    invoke-virtual {p0}, Ln54;->b()Lkw3;

    move-result-object p0

    return-object p0
.end method

.method public final b()Lkw3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo54;->f()Lnw3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Llw3;

    .line 6
    .line 7
    invoke-interface {p0}, Llw3;->b()Lkw3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo54;->f()Lnw3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Llw3;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Llw3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ln54;->Y:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
