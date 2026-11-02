.class public Ltj3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lpr5;


# static fields
.field public static final synthetic e:[Lnw3;


# instance fields
.field public final a:Lfk2;

.field public final b:Lke7;

.field public final c:Lte4;

.field public final d:Lka6;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Ltj3;

    .line 4
    .line 5
    const-string v2, "type"

    .line 6
    .line 7
    const-string v3, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lnw3;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, Ltj3;->e:[Lnw3;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lz47;Lja6;Lfk2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lc6;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Ltj3;->a:Lfk2;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-static {p2}, Llh4;->Z0(Lfk3;)Lhr6;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p3, Lke7;->G:Lg55;

    .line 24
    .line 25
    :goto_0
    iput-object p3, p0, Ltj3;->b:Lke7;

    .line 26
    .line 27
    iget-object p3, v0, Lc6;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p3, Lve4;

    .line 30
    .line 31
    new-instance v0, Lc3;

    .line 32
    .line 33
    const/16 v1, 0x10

    .line 34
    .line 35
    invoke-direct {v0, p1, p0, v1}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lte4;

    .line 39
    .line 40
    invoke-direct {p1, p3, v0}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Ltj3;->c:Lte4;

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p2}, Lja6;->b()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lwv0;->s0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lka6;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    :goto_1
    iput-object p1, p0, Ltj3;->d:Lka6;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final c()Lt14;
    .locals 2

    .line 1
    sget-object v0, Ltj3;->e:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Ltj3;->c:Lte4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lhi5;->e0(Lh65;Lnw3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Laa7;

    .line 16
    .line 17
    return-object p0
.end method

.method public final d()Lfk2;
    .locals 0

    .line 1
    iget-object p0, p0, Ltj3;->a:Lfk2;

    .line 2
    .line 3
    return-object p0
.end method

.method public e()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Le02;->X:Le02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Lke7;
    .locals 0

    .line 1
    iget-object p0, p0, Ltj3;->b:Lke7;

    .line 2
    .line 3
    return-object p0
.end method
