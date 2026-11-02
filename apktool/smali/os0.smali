.class public final Los0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final c:Ljava/util/Set;


# instance fields
.field public final a:Lhl1;

.field public final b:Lvt1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ltg7;->c:Lgk2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgk2;->i()Lfk2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lqs0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lfk2;->b()Lfk2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, v0, Lfk2;->a:Lgk2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v2, v0}, Lqs0;-><init>(Lfk2;Lv15;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lw45;->U(Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Los0;->c:Ljava/util/Set;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lhl1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Los0;->a:Lhl1;

    .line 5
    .line 6
    iget-object p1, p1, Lhl1;->a:Lve4;

    .line 7
    .line 8
    new-instance v0, Lf0;

    .line 9
    .line 10
    const/16 v1, 0xb

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lve4;->c(Lgn2;)Lvt1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Los0;->b:Lvt1;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lqs0;Lhs0;)Lsx4;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lns0;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lns0;-><init>(Lqs0;Lhs0;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Los0;->b:Lvt1;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lvt1;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lsx4;

    .line 16
    .line 17
    return-object p0
.end method
