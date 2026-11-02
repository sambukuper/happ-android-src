.class public abstract Lqb3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ltv2;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lqb3;->a:Lox1;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lkx4;Lxz4;Ltb3;)Lkx4;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lrb3;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lrb3;-><init>(Lxz4;Ltb3;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
