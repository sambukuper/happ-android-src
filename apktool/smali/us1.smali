.class public final Lus1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Lus1;

.field public static final b:Lbu5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lus1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lus1;->a:Lus1;

    .line 7
    .line 8
    new-instance v0, Lbu5;

    .line 9
    .line 10
    const-string v1, "kotlin.Double"

    .line 11
    .line 12
    sget-object v2, Lzt5;->P:Lzt5;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lbu5;-><init>(Ljava/lang/String;Lzt5;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lus1;->b:Lbu5;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p1, v0, v1}, Lol7;->f(D)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, Lrd1;->E()D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lus1;->b:Lbu5;

    .line 2
    .line 3
    return-object p0
.end method
