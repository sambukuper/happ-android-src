.class public final Le44;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lci5;


# instance fields
.field public q0:F

.field public r0:Z


# virtual methods
.method public final b(Lfi1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    instance-of p1, p2, Luq6;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Luq6;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    new-instance p2, Luq6;

    .line 12
    .line 13
    invoke-direct {p2}, Luq6;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget p1, p0, Le44;->q0:F

    .line 17
    .line 18
    iput p1, p2, Luq6;->a:F

    .line 19
    .line 20
    iget-boolean p0, p0, Le44;->r0:Z

    .line 21
    .line 22
    iput-boolean p0, p2, Luq6;->b:Z

    .line 23
    .line 24
    return-object p2
.end method
